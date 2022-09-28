package com.example.finance.service;

import com.example.finance.entity.Account;
import com.example.finance.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public void addAccount(Account account){
        log.info("Account Service");
        accountRepository.save(account);
    }
}
