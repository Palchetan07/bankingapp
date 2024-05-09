package com.example.bankingapp.service;

import com.example.bankingapp.dto.Paymentdto;
import com.example.bankingapp.entity.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);
@Autowired
private AccountServiceImpl accountServiceImpl;

    @Override
    public void deposit(Paymentdto paymentdto) {

        Payment payment = new Payment();
        payment.setAmount(paymentdto.getAmount());
        payment.setDestinationAmount(payment.getDestinationAmount());
//payment.getPaymentType(payment.getPaymentType());

//        logger.info("Payment Entry " + payment.toString());

        accountServiceImpl.UpdateAccountBalance();


    }

    @Override
    public void withdraw() {

    }

    @Override
    public void transfer() {

    }
}
