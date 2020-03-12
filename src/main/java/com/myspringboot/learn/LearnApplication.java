package com.myspringboot.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan(basePackages = {"com.mybatis.dao"})
@ComponentScan(basePackages = {"com.myspringboot.controller", "com.myspringboot.service.impl"})
public class LearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }
}
