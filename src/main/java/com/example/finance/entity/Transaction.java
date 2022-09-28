package com.example.finance.entity;

import com.example.finance.repository.AccountRepository;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Table(name = "transactions")
@Entity
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;

    @Column(name = "accountId", nullable = false)
    @NotBlank(message = "name could not be null or empty")
    private long accountId;

    @Column(name = "amount", nullable = false)
    @NotBlank(message = "name could not be null or empty")
    double amount;

}
