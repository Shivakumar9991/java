package com.xworkz.passportseva.dao;

import com.xworkz.passportseva.dto.PassportDto;

public class PassportDao {

   PassportDto dto;

   public boolean createpassport( PassportDto dto){
       System.out.println("Create Passport Started");
         boolean isPassportcreated = false;
         if(null!=dto){
             this.dto= dto;
             isPassportcreated = true;
         }else{
             System.out.println("Please Provide Valid Details");
         }
       System.out.println("Create Passport Ended");
         return isPassportcreated;
   }
              public void getDetails(){
                  System.out.println("Name :- " +dto.userName);
                  System.out.println("Last Name :- "+ dto.userLastName);
                  System.out.println("Mobile No :- "+ dto.phoneNo);
                  System.out.println("Gender :- "+ dto.gen);
                  System.out.println("Status :- "+ dto.sta);
                  System.out.println("Enter E-Mail :- "+ dto.entEmail);
                  System.out.println("Conform E-Mail :- "+ dto.cnfEmail);
                  System.out.println("Creat Password :- "+ dto.crtPassword);
                  System.out.println("Conform Password :- "+ dto.cnfPassword);
                  System.out.println("Enter Current Address :- "+ dto.curAddress);
                  System.out.println("Enter PinCode :- "+ dto.pc);
              }


}
