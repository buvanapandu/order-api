package com.mona.order_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Mona, my first endpoint!";
    }
    @GetMapping("/status")
    public String status() {
        return "Mona status active";
    }
}