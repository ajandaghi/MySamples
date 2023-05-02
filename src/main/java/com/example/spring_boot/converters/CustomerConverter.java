package com.example.spring_boot.converters;

import com.example.spring_boot.models.Dto.Customer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface CustomerConverter extends BaseConverter< Customer, com.example.spring_boot.models.entities.Customer>{}
