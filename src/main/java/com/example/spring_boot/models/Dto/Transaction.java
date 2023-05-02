package com.example.spring_boot.models.Dto;

import com.example.spring_boot.models.entities.AbstractEntity;
import com.example.spring_boot.models.entities.Account;
import com.example.spring_boot.models.entities.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;


@Getter
@Setter
public class Transaction extends AbstractDto {
    private TransactionType transactionType;

    private Account account;

    private Long amount;
    private Long accountId;





}
