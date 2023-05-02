package com.example.spring_boot.models.entities;

import com.example.spring_boot.models.entities.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)

public class Transaction extends AbstractEntity{
    private TransactionType transactionType;

    @ManyToOne
    private Account account;

    private Long amount;





}
