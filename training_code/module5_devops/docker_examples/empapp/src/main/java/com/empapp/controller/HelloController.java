package com.empapp.controller;

import com.empapp.dto.Employee;
import com.empapp.service.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private InstanceInformationService instanceInformationService;

    @GetMapping(path="hello-world")
    public String hello(){
        return "hello empapp v2  :"+
                instanceInformationService.retrieveInstanceInfo();
    }
    @GetMapping(path = "employees/{id}")
    public Employee employeeById(@PathVariable int id){
        return new Employee(id, "raj",6700.00);
    }
}