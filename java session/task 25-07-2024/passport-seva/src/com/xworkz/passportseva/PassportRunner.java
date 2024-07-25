package com.xworkz.passportseva;

import com.xworkz.passportseva.dao.PassportDao;
import com.xworkz.passportseva.dto.PassportDto;

public class PassportRunner {
    public static void main(String[]args){
        System.out.println("Main Method Started");
         PassportDto details = new PassportDto();
         details.userName = "Channaveer Ch";
         details.userLastName = "Harkud";
         details.phoneNo = 9019830153L;
         details.gen = 'M';
         details.sta = "Single";
         details.entEmail = "channuch69@gmail.com";
         details.cnfEmail = "channuch69@gmail.com";
         details.crtPassword = "901983CH";
         details.cnfPassword="901983CH";
         details.curAddress="Revansiddeshwara colony";
         details.pc = 585104;

        PassportDao dao = new PassportDao();
         boolean create = dao.createpassport(details);
        System.out.println("Details Are Created = " + create);

        dao.getDetails();

        System.out.println("Main Method Ended");
    }

}
