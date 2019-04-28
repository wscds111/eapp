package com.dingding.modules;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dingding.modules.*.mapper")
public class EappApplication {
    public static void main(String[] args) {
        SpringApplication.run(EappApplication.class, args);
    }

}
