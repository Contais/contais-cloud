package com.contais.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lham
 * @version 1.0
 * @description com.contais.order
 * @date 2025/4/10
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.contais")
public class ContaisOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContaisOrderApplication.class);
    }
}
