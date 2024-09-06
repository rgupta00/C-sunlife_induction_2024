package com.productapp.controller;

import com.productapp.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoDtoController {

    @Autowired
    private InfoDto infoDto;

    @GetMapping(path = "infodto")
    public InfoDto infoDto(){
        return infoDto;
    }

}
