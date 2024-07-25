package com.xworkz.facebook.dao;

import com.xworkz.facebook.dto.FaceBookDto;

public class FaceBookDao {

    FaceBookDto dto;
    public boolean createAccount( FaceBookDto dto){
        System.out.println("Create Account Started");
        boolean isAccountCreated = false;
        if(null!=dto){
            this.dto = dto;
            isAccountCreated = true;
        }else System.out.println("Please Provide Valid Details");


        System.out.println("Create Account Ended");
        return isAccountCreated;
    }
    public void getDetails(){
        System.out.println("FULL NAME = "+ dto.name);
        System.out.println("LAST NAME = "+ dto.lname);
        System.out.println("DATE OF BIRTH = "+ dto.db);
        System.out.println("ENTER PHONE NUMBER = "+ dto.phoneno);
        System.out.println("ENTER = "+ dto.mail);
        System.out.println("CREATE PASSWORD = "+ dto.ctrPassword);
        System.out.println("CONFORM PASSWORD = "+ dto.confPassword);
    }
}
