package com.example.finance.repository;

import com.example.finance.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findAll();
}
