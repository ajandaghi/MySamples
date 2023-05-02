package com.example.spring_boot.controllers;

import com.example.spring_boot.models.entities.Card;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController extends AbstractController<Card, com.example.spring_boot.models.Dto.Card> {
}
