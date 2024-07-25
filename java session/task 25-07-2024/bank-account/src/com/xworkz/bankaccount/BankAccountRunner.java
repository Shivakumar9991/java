package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.BankAccountDao;
import com.xworkz.bankaccount.dto.BankAccountDto;

public class BankAccountRunner {

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        BankAccountDto details = new BankAccountDto();
        details.userName = "Channaveer";
        details.lastName = "Madenavar";
        details.dateOfBirth = "06/08/2001";
        details.occupation = "Unemployee";
        details.gender = 'M';
        details.phoneNumber = 8722525805L;

        BankAccountDao ref = new BankAccountDao();
        boolean detail = ref.createBankAccount(details);
        System.out.println("Account Created = " + detail);
        ref.getDetails();
        System.out.println("Main Method Ended");
    }

}
