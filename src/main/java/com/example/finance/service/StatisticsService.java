package com.example.finance.service;

import com.example.finance.entity.Transaction;
import com.example.finance.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsService {

    private final TransactionRepository transactionRepository;

    public StatisticsService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    public List<Transaction> getMonthTransactions(int month){
        return transactionRepository.getMonthTransactions(month);
    }
}
