package com.cherrycalf.filegohome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TC {

    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }
}
