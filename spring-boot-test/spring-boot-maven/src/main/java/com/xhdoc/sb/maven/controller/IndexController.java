package com.xhdoc.sb.maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String hello() {
        return "hello world~";
    }
}
