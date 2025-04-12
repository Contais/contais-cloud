package com.contais.trade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {

    @GetMapping("/test/{num}")
    public int test(@PathVariable(value = "num") int num) {
        return 10 / num;
    }
}
