package com.xhdoc.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String hello() {
        return "hello world~";
    }
}
