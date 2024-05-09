package com.example.bankingapp.controller;

import com.example.bankingapp.dto.Paymentdto;
import com.example.bankingapp.service.PaymentService;
import com.example.bankingapp.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {


    @Autowired

    private PaymentServiceImpl paymentServiceImpl;

    @GetMapping("/health")
    public String health(){
        return "Hello Buddy My health is good";

    }

    @PostMapping("/deposit")
    public void deposit(@RequestBody Paymentdto paymentdto){
        paymentServiceImpl.deposit(paymentdto);
    }
}
