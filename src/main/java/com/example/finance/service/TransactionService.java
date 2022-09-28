package com.example.finance.service;

import com.example.finance.entity.Account;
import com.example.finance.entity.Transaction;
import com.example.finance.repository.AccountRepository;
import com.example.finance.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionService (TransactionRepository transactionRepository, AccountRepository accountRepository){
        this.transactionRepository=transactionRepository;
        this.accountRepository=accountRepository;
    }

    public boolean addTransaction(Transaction transaction){

        Optional<Account> account = accountRepository.findById(transaction.getAccountId());
        if(!account.isPresent()){
            return false;
        }
        transactionRepository.save(transaction);
        account.get().setBalance(account.get().getBalance()+transaction.getAmount());
        accountRepository.save(account.get());
        return true;
    }

}
