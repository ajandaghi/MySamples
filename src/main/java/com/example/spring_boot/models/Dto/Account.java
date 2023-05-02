package com.example.spring_boot.models.Dto;

import com.example.spring_boot.models.entities.AbstractEntity;
import com.example.spring_boot.models.entities.Card;
import com.example.spring_boot.models.entities.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Getter
@Setter
public class Account extends AbstractDto {
    private String AccountNo;
    private Long balance;

    private List<Customer> customers;

    private Card card;

    private List<Long> customerIds;

}
