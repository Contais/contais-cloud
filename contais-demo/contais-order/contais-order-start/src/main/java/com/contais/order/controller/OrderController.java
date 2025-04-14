package com.contais.order.controller;

import com.contais.order.entity.Order;
import com.contais.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/purchase")
    public Order purchase(@RequestParam(name = "userId") String userId,
                          @RequestParam(name = "commodityCode") String commodityCode,
                          @RequestParam(name = "orderCount") int orderCount) {
        return orderService.purchase(userId, commodityCode, orderCount);
    }
}
