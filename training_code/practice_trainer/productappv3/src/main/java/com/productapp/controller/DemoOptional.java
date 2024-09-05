package com.productapp.controller;

import com.productapp.exceptions.ProductNotFoundException;

import java.util.Optional;

//java 8: Optional class: npe
public class DemoOptional {
    public static void main(String[] args) {
        Optional<String> cityNameOptional=getCity(2);

        System.out.println(cityNameOptional
                .orElseThrow(()->new ProductNotFoundException("not found")));
    }


    public static Optional<String> getCity(int id){

        return Optional.ofNullable(null);
    }
}
