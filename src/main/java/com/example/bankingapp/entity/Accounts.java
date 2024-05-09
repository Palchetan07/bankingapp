package com.example.bankingapp.entity;

public class Accounts {

    private Long id;
    private double Balance;
    private String AccountNumber;
    private Long userId;


    public Accounts(){
        super();
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", Balance='" + Balance + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Accounts(Long id, double balance, String accountNumber, Long userId) {
        this.id = id;
        Balance = balance;
        AccountNumber = accountNumber;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
