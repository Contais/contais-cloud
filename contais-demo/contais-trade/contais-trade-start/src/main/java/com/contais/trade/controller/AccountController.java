package com.contais.trade.controller;

import com.contais.trade.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@RefreshScope
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Value("${contais.config.test:abc}")
    private String configTest;

    @PostMapping("/debit")
    public boolean debit(@RequestParam("userId") String userId, @RequestParam("money") int money) {
        return accountService.debit(userId, money);
    }

    @GetMapping("/test")
    public String test() {
        return configTest;
    }

}
