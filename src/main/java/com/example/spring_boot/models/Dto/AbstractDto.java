package com.example.spring_boot.models.Dto;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AbstractDto {


    private Long id;
    private Integer version;
    private Date insertTimeStamp;
    private Date lastUpdateTimeStamp;

}
