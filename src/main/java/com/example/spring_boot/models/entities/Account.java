package com.example.spring_boot.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Entity
@Audited
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)

public class Account extends AbstractEntity {
    private String AccountNo;
    private Long balance;

    @ManyToMany
    private List<Customer> customers;

    @OneToOne(mappedBy = "account")
    private Card card;

}
