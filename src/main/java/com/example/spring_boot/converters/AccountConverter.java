package com.example.spring_boot.converters;

import com.example.spring_boot.models.entities.Account;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel ="spring")
public interface AccountConverter extends BaseConverter< com.example.spring_boot.models.Dto.Account,Account> {

}
