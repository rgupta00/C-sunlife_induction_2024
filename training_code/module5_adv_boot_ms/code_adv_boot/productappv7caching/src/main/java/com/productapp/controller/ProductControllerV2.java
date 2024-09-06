//package com.productapp.controller;
//
//import com.productapp.dto.ProductDto;
//import com.productapp.service.ProductService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.hateoas.CollectionModel;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.Link;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@RestController
//@RequestMapping(path = "productapp/v2")
//public class ProductControllerV2 {
//
//    private  ProductService productService;
//
//    @Value("${productapp.messages.add_successfully}")
//    private String addSuccessfully;
//
//
//    public ProductControllerV2(ProductService productService) {
//        this.productService = productService;
//    }
//
//
//    @GetMapping(path = "products", produces =
//            {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
//    public CollectionModel<ProductDto> getAllWithSelfLink() {
//        //BL+Ex handling (CCC): AOP
//      List<ProductDto>productDtos=  productService.findAll();
//      for(ProductDto productDto: productDtos){
//          Link link=linkTo(methodOn(ProductControllerV2.class)
//                  .findByIdLink(productDto.getId())).withSelfRel();
//          productDto.add(link);
//      }
//      return CollectionModel.of(productDtos);
//    }
//
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping(path = "products{id}")
//    public EntityModel<ProductDto> findByIdLink(@PathVariable int id) {
//        Link link = linkTo(methodOn(ProductControllerV2.class)
//                .findByIdLink(id)).withSelfRel();
//        ProductDto productDto = productService.getById(id);
//        productDto.add(link);
//        return EntityModel.of(productDto);
//    }
//}
//
