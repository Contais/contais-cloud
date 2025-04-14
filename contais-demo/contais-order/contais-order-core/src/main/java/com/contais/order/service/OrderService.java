package com.contais.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.contais.order.entity.Order;

public interface OrderService extends IService<Order> {

    Order purchase(String userId, String commodityCode, int orderCount);
}
