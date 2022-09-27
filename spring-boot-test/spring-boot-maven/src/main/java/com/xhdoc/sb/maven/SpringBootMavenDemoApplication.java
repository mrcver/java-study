package com.xhdoc.sb.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringBootMavenDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMavenDemoApplication.class, args);
    }

}
