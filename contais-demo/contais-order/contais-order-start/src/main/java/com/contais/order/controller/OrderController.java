package com.contais.order.controller;

import com.contais.trade.feign.client.TradeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private TradeClient tradeClient;

    @GetMapping("/test/{num}")
    public int test(@PathVariable(value = "num") int num) {
        return tradeClient.test(num);
    }
}
