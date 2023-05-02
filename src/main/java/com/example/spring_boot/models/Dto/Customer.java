package com.example.spring_boot.models.Dto;

import com.example.spring_boot.models.entities.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends AbstractDto {
    private String fullName;
    private String nationalCode;
    private String customerNo;
    private String email;
    private String mobileNo;
    private List<Account> accounts;




}
