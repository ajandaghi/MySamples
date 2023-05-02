package com.example.spring_boot.controllers;

import com.example.spring_boot.models.entities.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController extends AbstractController<Transaction, com.example.spring_boot.models.Dto.Transaction> {

}
