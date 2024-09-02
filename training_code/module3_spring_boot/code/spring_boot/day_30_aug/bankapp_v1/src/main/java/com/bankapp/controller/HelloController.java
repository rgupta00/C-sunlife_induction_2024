package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //@PathVariable vs @RequestParam
    //   /                  ? &
    //http://localhost:8090/hello/ravi/noida
    @GetMapping(path = "hello/{name}/{address}")
    public String hello(@PathVariable(name = "name") String uname,
                        @PathVariable String address){
        return "hello champs! "+ uname+" address is "+ address;
    }

    //http://localhost:8090/hello2?name=raiv&address=noida
    @GetMapping(path = "hello2")
    public String hello2(@RequestParam(name = "name") String uname,
                        @RequestParam String address){
        return "hello champs! "+ uname+" address is "+ address;
    }
}
