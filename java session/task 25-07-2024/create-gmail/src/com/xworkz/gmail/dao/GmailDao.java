package com.xworkz.gmail.dao;

import com.xworkz.gmail.dto.GmailDto;

public class GmailDao {
    GmailDto dto;

    public boolean createGmail(GmailDto dto){
        System.out.println("Create Gmail Started");
        boolean isGmailCreated = false;
        if(null!=dto){
            this.dto = dto;
            isGmailCreated = true;

        }else System.out.println("Please Provide Valid Details");

        System.out.println("Create Gmail Ended");
        return isGmailCreated;
    }
    public void getDetails(){

        System.out.println("FULL NAME = "+ dto.nme);
        System.out.println("LAST NAME = "+ dto.ln);
        System.out.println("GENDER = "+ dto.g);
        System.out.println("DATE OF BIRTH = "+ dto.db);
        System.out.println("ENTER PHONE NUMBER = "+ dto.pono);
        System.out.println("CREATE PASSWORD = "+ dto.ctrPassword);
        System.out.println("CONFORM PASSWORD = "+ dto.confPassword);
    }
}
