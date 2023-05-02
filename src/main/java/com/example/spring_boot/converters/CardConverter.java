package com.example.spring_boot.converters;

import com.example.spring_boot.models.Dto.Card;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface CardConverter extends BaseConverter<Card, com.example.spring_boot.models.entities.Card> {
}
