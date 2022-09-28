package com.example.finance.entity;

import com.example.finance.repository.AccountRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Table(name = "transactions")
@Entity
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;


    @Column(name = "date", nullable = false)
    @NotBlank(message = "date could not be null or empty")
    @JsonFormat(pattern="jj/MM/yyyy")
    private Date date;

    @Column(name = "accountId", nullable = false)
    @NotBlank(message = "acountId could not be null or empty")
    private long accountId;

    @Column(name = "amount", nullable = false)
    @NotBlank(message = "name could not be null or empty")
    double amount;

}
