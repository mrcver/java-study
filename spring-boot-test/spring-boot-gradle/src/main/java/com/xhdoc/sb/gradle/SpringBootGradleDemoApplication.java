package com.xhdoc.sb.gradle;

import com.xhdoc.sb.gradle.bean.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGradleDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleDemoApplication.class, args);
    }

    @Bean
    public TestBean testBean() {
        return new TestBean();
    }
}
