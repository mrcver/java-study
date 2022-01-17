package com.example.beantest.controller;

import com.example.beantest.bean.TestBean;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/")
  String test() {
    return "test";
  }
}
