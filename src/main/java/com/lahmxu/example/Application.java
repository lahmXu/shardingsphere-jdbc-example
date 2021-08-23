package com.lahmxu.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@MapperScan("com.lahmxu.example.dao")
@SpringBootApplication(exclude = {JtaAutoConfiguration.class})
public class Application {

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
    }

}
