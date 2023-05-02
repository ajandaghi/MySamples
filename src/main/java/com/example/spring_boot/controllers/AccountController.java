package com.example.spring_boot.controllers;

import com.example.spring_boot.models.entities.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController extends AbstractController<Account, com.example.spring_boot.models.Dto.Account> {
}
