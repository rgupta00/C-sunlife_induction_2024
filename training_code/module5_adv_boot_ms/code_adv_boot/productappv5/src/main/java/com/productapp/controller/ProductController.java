package com.productapp.controller;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private  ProductService productService;

    @Value("${productapp.messages.add_successfully}")
    private String addSuccessfully;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //RepsoneEntity vs @ResponseStatus
    //get all products

    @GetMapping(path = "products/v1", produces =
            {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ProductDto>> getAll() {
        //BL+Ex handling (CCC): AOP
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }
    @GetMapping(path = "products/v2", produces =
            {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public CollectionModel<ProductDto> getAllWithSelfLink() {
        //BL+Ex handling (CCC): AOP
      List<ProductDto>productDtos=  productService.findAll();
      for(ProductDto productDto: productDtos){
          Link link=linkTo(methodOn(ProductController.class)
                  .findByIdLink(productDto.getId())).withSelfRel();
          productDto.add(link);
      }
      return CollectionModel.of(productDtos);
    }
    //add product
    @PostMapping(path = "products")
    @ResponseStatus(HttpStatus.CREATED)
    public String addProduct(@Valid @RequestBody ProductDto productDto){
         productService.addProduct(productDto);
         return addSuccessfully;
    }
    //update
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "products/{id}")
    public ProductDto updateProduct(@PathVariable int id,
                                 @Valid @RequestBody ProductDto productDto){
        return productService.updateProduct(id, productDto);
    }
    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "products/{id}")
    public void delete(@PathVariable int id){
        productService.deleteProduct(id);
    }

    //getbyid
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "products/v1/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.getById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "products/v2/{id}")
    public EntityModel<ProductDto> findByIdLink(@PathVariable int id){
        Link link=linkTo(methodOn(ProductController.class)
                .findByIdLink(id)).withSelfRel();
        ProductDto productDto= productService.getById(id);
        productDto.add(link);
        return EntityModel.of(productDto);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "productsbyname/{name}")
    public List<ProductDto> getByName(@PathVariable String name){
        return productService.getByName(name);
    }
}

