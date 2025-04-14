package com.contais.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.contais.order.entity.Order;
import com.contais.order.mapper.OrderMapper;
import com.contais.order.service.OrderService;
import com.contais.order.service.StorageService;
import com.contais.trade.feign.client.TradeClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private StorageService storageService;
    @Autowired
    private TradeClient tradeClient;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Order purchase(String userId, String commodityCode, int orderCount) {
        storageService.deduct(commodityCode, orderCount);
        Order order = this.create(userId, commodityCode, orderCount);
        return order;
    }

    private Order create(String userId, String commodityCode, int orderCount) {
        int money = orderCount * 10;
        boolean debitFlag = tradeClient.accountDebit(userId, money);
        if (!debitFlag) {
            log.warn("账户服务扣款失败 userId:{}, money:{}", userId, money);
            throw new RuntimeException();
        }

        if (orderCount < 1) {
            log.info("test seata rollback...");
            throw new RuntimeException();
        }

        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(orderCount);
        order.setMoney(money);
        save(order);
        return order;
    }
}
