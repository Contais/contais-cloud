package com.contais.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Contais
 * @version 1.0
 * @description com.contais.config.controller
 * @date 2019/6/16
 * @刷新配置: http://localhost:18082/actuator/refresh
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${contais.name}")
    private String name;

    /**
     * http://localhost:18082/config/info
     */
    @GetMapping("config/info")
    public String hello(){
        return "contais.name: " + name;
    }
}
