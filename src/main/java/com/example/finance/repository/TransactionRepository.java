package com.example.finance.repository;

import com.example.finance.entity.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;


public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    @Query(value="SELECT t FROM transactions t where MONTH(t.date = ?1)")
    public Collection<Transaction> getMonthTransactions(int month);
}
