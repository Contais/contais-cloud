package com.contais.trade.feign.client;

import com.contais.trade.feign.fallback.TradeClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(contextId = "tradeClient", value = "contais-trade", fallbackFactory = TradeClientFallbackFactory.class)
public interface TradeClient {

    @GetMapping("test/{num}")
    int test(@PathVariable(value = "num") int num);

}
