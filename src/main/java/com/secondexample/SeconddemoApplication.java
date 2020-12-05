package com.secondexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.secondexample.mapper")
public class SeconddemoApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SeconddemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SeconddemoApplication.class, args);
    }

}
