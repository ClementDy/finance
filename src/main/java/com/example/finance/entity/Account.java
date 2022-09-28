package com.example.finance.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "accounts")
@Entity
@Getter @Setter
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private long id;

    @Column(name = "name", nullable = false)
    @NotBlank(message = "name could not be null or empty")
    String name;

    @Column(name = "balance", nullable = false)
    @NotBlank(message = "balance could not be null or empty")
    double balance;

}
