package com.contais.trade;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lham
 * @version 1.0
 * @description com.contais.trade
 * @date 2025/4/10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ContaisTradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContaisTradeApplication.class, args);
    }
}
