package com.xworkz.aadharcard.dao;

import com.xworkz.aadharcard.dto.AadharCardDto;

public class AadharCardDao {

    AadharCardDto dto;

    public boolean createAccount(AadharCardDto dto){
        System.out.println("Account Created Started");
        boolean isAccountCreated= false;
        if(null!=dto){
            this.dto = dto;
            isAccountCreated = true;

        }else System.out.println("Please Provide valid Details");
     System.out.println("Account Created Ended");
        return isAccountCreated;
    }

    public void getDetails(){
        System.out.println("The Name is : " + dto.candidateName);
        System.out.println("The Father Name is :"+ dto.candidateFatherName);
        System.out.println("The Date of Birth :"+ dto.candidateDob);
        System.out.println("The Conatact Number is :"+ dto.candidateContactNumber);
        System.out.println("The Address is :"+ dto.candidateAddress);
    }
}
