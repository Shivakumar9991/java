package com.xworkz.gmail;

import com.xworkz.gmail.dao.GmailDao;
import com.xworkz.gmail.dto.GmailDto;

public class GmailRunner {

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        GmailDto dto = new GmailDto();
        dto.nme = "C Channu";
        dto.ln = "Harkude";
        dto.g = 'M';
        dto.db = "12/02/2001";
        dto.pono = 9632084956L;
        dto.ctrPassword="c1channu";
        dto.confPassword="c1channu";

        GmailDao details = new GmailDao();
        boolean create = details.createGmail(dto);
        System.out.println("Gmail Created = " +create);

        details.getDetails();
        System.out.println("Main Method Ended");


    }
}
