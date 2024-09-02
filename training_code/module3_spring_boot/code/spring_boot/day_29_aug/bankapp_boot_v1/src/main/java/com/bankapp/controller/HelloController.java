package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //http://localhost:8090/hellourl/ekta/banglore
    @GetMapping(path = "hellourl/{name}/{address}")
    public String hello(@PathVariable String name, @PathVariable String address){
        return "hello champ ! your name is "+ name+" address is "+ address;
    }
    //http://localhost:8090/hellourl2?name=foo&city=noida
    @GetMapping(path = "hellourl2")
    public String hello2(@RequestParam(name = "name")String name, @RequestParam String city){
        return "hello champ ! your name is "+ name+" address is "+ city;
    }
}
