package com.example.spring_boot.models.Dto;

import com.example.spring_boot.models.entities.AbstractEntity;
import com.example.spring_boot.models.entities.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.hibernate.envers.Audited;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card extends AbstractDto {
    private String cardNo;
    private Account account;

    private Long accountId;
}
