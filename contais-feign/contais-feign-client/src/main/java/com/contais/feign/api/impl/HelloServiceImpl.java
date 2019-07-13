package com.contais.feign.api.impl;

import com.contais.feign.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author Contais
 * @version 1.0
 * @description com.contais.feign.api.impl
 * @date 2019/7/13
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "Hello,Feign~";
    }

}
