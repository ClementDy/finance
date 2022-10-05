package com.example.finance.controller;

import com.example.finance.entity.Transaction;
import com.example.finance.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("transaction")
    public ResponseEntity<Void> addTransaction(@RequestBody Transaction transaction){
        boolean transactionProcessed=false;
        transactionProcessed = transactionService.addTransaction(transaction);
        if (transactionProcessed){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.internalServerError().build();
    }
}
