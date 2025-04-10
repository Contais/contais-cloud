package com.contais.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("contais-feign-client")
public interface HelloService {

    @GetMapping("/feign/hello")
    String hello();
}
