package com.contais.trade.feign.config;

import com.contais.trade.feign.fallback.TradeClientFallbackFactory;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.contais.trade.feign")
@EnableFeignClients(basePackages = "com.contais.trade.feign.client")
public class ContaisTradeFeignConfiguration {
    @Bean
    public TradeClientFallbackFactory tradeClientFallbackFactory() {
        return new TradeClientFallbackFactory();
    }
}
