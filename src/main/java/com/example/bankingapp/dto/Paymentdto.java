package com.example.bankingapp.dto;

import com.example.bankingapp.domain.PaymentType;
import com.example.bankingapp.entity.Payment;

public class Paymentdto {
    private Long id;
    private  String amount;
    private  String SourceAmount;
    private  String DestinationAmount  ;
   private PaymentType paymentType;

    @Override
    public String toString() {
        return "Paymentdto{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", SourceAmount='" + SourceAmount + '\'' +
                ", DestinationAmount='" + DestinationAmount + '\'' +
                ", paymentType=" + paymentType +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSourceAmount() {
        return SourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        SourceAmount = sourceAmount;
    }

    public String getDestinationAmount() {
        return DestinationAmount;
    }

    public void setDestinationAmount(String destinationAmount) {
        DestinationAmount = destinationAmount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Paymentdto(Long id, String amount, String sourceAmount, String destinationAmount, PaymentType paymentType) {
        this.id = id;
        this.amount = amount;
        SourceAmount = sourceAmount;
        DestinationAmount = destinationAmount;
        this.paymentType = paymentType;
    }
}
