package com.contais.trade.controller;

import com.contais.trade.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/debit")
    public boolean debit(@RequestParam("userId") String userId, @RequestParam("money") int money) {
        return accountService.debit(userId, money);
    }
}
