package com.xworkz.facebook;

import com.xworkz.facebook.dao.FaceBookDao;
import com.xworkz.facebook.dto.FaceBookDto;

public class FaceBookRunner {


    public static void main(String[] args) {
        System.out.println("Main Method Started");
        FaceBookDto dto = new FaceBookDto();
        dto.name = "Rakesh";
        dto.lname = "Chincholi";
        dto.db = "08/03/1999";
        dto.phoneno = 9019830153L;
        dto.mail = "rocky1234@gmail.com";
        dto.ctrPassword ="901987R";
        dto.confPassword = "901987R";

        FaceBookDao detail = new FaceBookDao();
        boolean ref = detail.createAccount(dto);
        System.out.println("Account created = " +ref);
        detail.getDetails();
        System.out.println("Main Method Ended");
    }
}
