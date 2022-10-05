package com.example.finance.controller;

import com.example.finance.entity.Account;
import com.example.finance.entity.Transaction;
import com.example.finance.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class StatisticsController {

    private final StatisticsService statisticsService;

    @GetMapping("statistics/transaction/{month}")
    private List<Transaction> getMonthTransactions(@PathVariable("month") int month){
        return statisticsService.getMonthTransactions(month);

    }

}
