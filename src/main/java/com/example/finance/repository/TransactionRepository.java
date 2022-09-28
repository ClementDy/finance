package com.example.finance.repository;

import com.example.finance.entity.Account;
import com.example.finance.entity.Transaction;
import org.springframework.data.repository.CrudRepository;


public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
