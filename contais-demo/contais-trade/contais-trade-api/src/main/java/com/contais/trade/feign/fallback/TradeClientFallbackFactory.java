package com.contais.trade.feign.fallback;

import com.contais.trade.feign.client.TradeClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TradeClientFallbackFactory implements FallbackFactory<TradeClient> {
    @Override
    public TradeClient create(Throwable cause) {
        return new TradeClient() {
            @Override
            public int test(int num) {
                return -1;
            }
        };
    }
}
