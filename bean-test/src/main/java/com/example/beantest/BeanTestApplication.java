package com.example.beantest;

import com.example.beantest.bean.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(BeanTestApplication.class, args);
  }

  @Bean
  public TestBean testBean() {
    return new TestBean();
  }
}
