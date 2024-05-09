package com.example.bankingapp.service;

import com.example.bankingapp.dto.Paymentdto;

public interface PaymentService {

    void deposit(Paymentdto paymentdto);

    void withdraw();

    void transfer();

}
