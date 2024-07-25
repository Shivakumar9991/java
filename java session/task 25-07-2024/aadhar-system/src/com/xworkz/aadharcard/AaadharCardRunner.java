package com.xworkz.aadharcard;

import com.xworkz.aadharcard.dao.AadharCardDao;
import com.xworkz.aadharcard.dto.AadharCardDto;

public class AaadharCardRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        AadharCardDto details = new AadharCardDto();
        details.candidateName = "Shivakumar";
        details.candidateFatherName = "Jagadevappa";
        details.candidateDob = "18/02/2003";
        details.candidateContactNumber = 549784309248L;
        details.candidateAddress = "Ramteerth nagar aland check post , kalaburgi ";

        AadharCardDao dao = new AadharCardDao();
        boolean create = dao.createAccount(details);
        System.out.println("Account created = " + create);
            dao.getDetails();
        System.out.println("Main Method Ended");
    }
}

