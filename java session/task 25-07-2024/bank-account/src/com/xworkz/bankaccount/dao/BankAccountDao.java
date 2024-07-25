package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.BankAccountDto;

public class BankAccountDao {
    BankAccountDto dto;
    public boolean createBankAccount( BankAccountDto dto){
        System.out.println("Account Created Started");
        boolean isBankAccountCreated  = false;
        if(null!=dto){
            this.dto = dto;
            isBankAccountCreated = true;

        }else System.out.println("Please Provide Valid Details");
        System.out.println("Account Created Started");
        return isBankAccountCreated;
    }
    public void getDetails(){
        System.out.println("The User Name Is = " + dto.userName);
        System.out.println("The Last Name Is = " + dto.lastName);
        System.out.println("The Date Of Birth Is = " + dto.dateOfBirth);
        System.out.println("The Occupation Is = " + dto.occupation);
        System.out.println("The Gender Is = " + dto.gender);
        System.out.println("The Phone Number Is = " + dto.phoneNumber);

    }
}
