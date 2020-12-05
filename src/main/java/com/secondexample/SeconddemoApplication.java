package com.secondexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.secondexample.mapper")
public class SeconddemoApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SeconddemoApplication.class);
    }
    // 用来测试访问
    @RequestMapping("/index")
    public String home() {
        return "hello 已启动项目";
    }

    public static void main(String[] args) {
        SpringApplication.run(SeconddemoApplication.class, args);
    }

}
