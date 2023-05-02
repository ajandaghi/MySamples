package com.example.spring_boot.converters;

import com.example.spring_boot.models.Dto.Transaction;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface TransactionConverter extends BaseConverter <Transaction, com.example.spring_boot.models.entities.Transaction> {
}
