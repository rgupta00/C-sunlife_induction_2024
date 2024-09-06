package com.productapp.controller;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.productapp.dto.ProductDto;
import com.productapp.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
@RequestMapping(path = "productapp/v1")
public class ProductControllerV1 {

    private  ProductService productService;

    @Value("${productapp.messages.add_successfully}")
    private String addSuccessfully;


    public ProductControllerV1(ProductService productService) {
        this.productService = productService;
    }

    //RepsoneEntity vs @ResponseStatus
    //get all products

    @GetMapping(path = "products", produces =
            {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ProductDto>> getAll() {
        //BL+Ex handling (CCC): AOP
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
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
    @Operation(
            summary = "Retrieve a Product by Id",
            description = "Get a Product object by specifying its id. The response is Product object with id, title, price.",
            tags = { "tutorials", "get" })
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = ProductDto.class),
                    mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "products/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.getById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "productsbyname/{name}")
    public List<ProductDto> getByName(@PathVariable String name){
        return productService.getByName(name);
    }
}

