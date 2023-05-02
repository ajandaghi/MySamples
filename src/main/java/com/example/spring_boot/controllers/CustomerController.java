package com.example.spring_boot.controllers;

import com.example.spring_boot.models.entities.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController extends AbstractController<Customer, com.example.spring_boot.models.Dto.Customer> {

}
