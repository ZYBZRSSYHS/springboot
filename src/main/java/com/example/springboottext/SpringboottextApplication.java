package com.example.springboottext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//开启了spring组件扫描和springboot 的自动配置功能没相当于三注解合一


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringboottextApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboottextApplication.class, args);
    }
}