package com.example.finance.repository;

import com.example.finance.entity.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    @Query(value="FROM Transaction WHERE MONTH(date) = :month")
    public List<Transaction> getMonthTransactions(@Param("month") int month);

    //@Query(value="FROM transactions WHERE amount = :amount")
    //public Collection<Transaction> getMonthTransactions(@Param("amount") int amount);

    @Query(value="FROM Transaction WHERE accountId = ?1")
    public Collection<Transaction> getTransactionAccount(@Param("accountId") String accountId);

}
