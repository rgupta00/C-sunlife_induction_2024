package com.demojenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @GetMapping("time")
    public String date(){
        return LocalDateTime.now().toString();
    }
}
