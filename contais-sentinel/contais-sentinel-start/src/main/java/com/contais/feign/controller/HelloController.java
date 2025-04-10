package com.contais.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Contais
 * @version 1.0
 * @description com.contais.feign.controller
 * @date 2019/7/13
 */
@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hi() {
        return "hi~";
    }
}
