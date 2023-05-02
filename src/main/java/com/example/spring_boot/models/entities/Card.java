package com.example.spring_boot.models.entities;

import com.example.spring_boot.models.entities.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Getter
@Setter
public class Card extends AbstractEntity {
    private String cardNo;
    @OneToOne
    private Account account;
}
