package com.xhdoc.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim
 */
@RestController
public class IndexController {
    @Value("my.id")
    private Long id;

    @Value("my.name")
    private String name;

    @GetMapping("/")
    public String hello() {
        return "hello world~";
    }

    @GetMapping("/my")
    String my() {
        return "Name: " + name;
    }
}
