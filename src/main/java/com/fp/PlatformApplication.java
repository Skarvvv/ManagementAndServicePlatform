package com.fp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 声明入口类 且声明该入口为springboot项目的
 */
@SpringBootApplication
public class PlatformApplication {
    public static void main(String[] args){
        SpringApplication.run(PlatformApplication.class, args);
    }
}

