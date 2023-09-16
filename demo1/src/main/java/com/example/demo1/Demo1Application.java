package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        System.out.println("线上");
        System.out.println("分支 dev 测试");
        SpringApplication.run(Demo1Application.class, args);
    }

}
