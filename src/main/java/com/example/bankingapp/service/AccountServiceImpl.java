package com.example.bankingapp.service;

import com.example.bankingapp.entity.Accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl  implements AccountService{
private List<Accounts> accountList = new ArrayList<Accounts>();


public AccountServiceImpl(){
    CreateAccount();

}
    @Override
    public void CreateAccount() {
        accountList.add(new Accounts(1L,49.0, "202244",7L));
        accountList.add(new Accounts(2L,0.0, "202243",7L));



    }

    @Override
    public void UpdateAccountBalance() {

    }

    @Override
    public void getAccountBalance() {

    }
}
