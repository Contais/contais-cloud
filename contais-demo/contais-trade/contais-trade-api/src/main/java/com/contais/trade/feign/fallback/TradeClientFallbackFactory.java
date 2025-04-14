package com.contais.trade.feign.fallback;

import com.contais.trade.feign.client.TradeClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TradeClientFallbackFactory implements FallbackFactory<TradeClient> {
    @Override
    public TradeClient create(Throwable cause) {
        return new TradeClient() {
            @Override
            public boolean accountDebit(String userId, int money) {
                log.warn("Trade client fallback");
                log.warn("request accountDebit error");
                return false;
            }
        };
    }
}
