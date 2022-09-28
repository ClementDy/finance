package com.example.finance.controller;

import com.example.finance.entity.Account;
import com.example.finance.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AccountController {

    private final AccountService accountService;

    @GetMapping("accounts")
    private List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @PostMapping("account")
    public ResponseEntity<Void> addAccount(@RequestBody Account account){
        log.info("Account");
        accountService.addAccount(account);
        return ResponseEntity.ok().build();
    }
}
