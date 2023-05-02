package com.example.spring_boot.repositories;

import com.example.spring_boot.models.entities.Account;
import com.example.spring_boot.models.entities.Card;

public interface CardRepository extends BaseRepository<Card,Long> {
  Card findCardByAccount_Id(Long accountId);

}
