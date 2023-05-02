package com.example.spring_boot.models.entities;

import com.example.spring_boot.models.entities.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Audited
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends AbstractEntity {
    private String fullName;
    private String nationalCode;
    private String customerNo;
    private String email;
    private String mobileNo;

    @ManyToMany(mappedBy = "customers")
    private List<Account> accounts;


}
