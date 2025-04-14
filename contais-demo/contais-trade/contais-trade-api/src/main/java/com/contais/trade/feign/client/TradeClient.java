package com.contais.trade.feign.client;

import com.contais.trade.feign.fallback.TradeClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "tradeClient", value = "contais-trade", fallbackFactory = TradeClientFallbackFactory.class)
public interface TradeClient {

    @PostMapping("/account/debit")
    boolean accountDebit(@RequestParam("userId") String userId, @RequestParam("money") int money);

}
