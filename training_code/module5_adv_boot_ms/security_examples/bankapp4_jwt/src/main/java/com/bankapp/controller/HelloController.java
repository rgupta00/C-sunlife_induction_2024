package com.bankapp.controller;

import com.bankapp.config.SecUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {


    @GetMapping(path = "home")
    public String home(){
        return "home";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping(path = "admin")
    public String admin(){
        return "admin";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MGR')")
    @GetMapping(path = "mgr")
    public String mgr(){
        return "mgr";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MGR') or  hasAuthority('ROLE_CLERK')")
    @GetMapping(path = "clerk")
    public String clerk(){
        return "clerk";
    }
}