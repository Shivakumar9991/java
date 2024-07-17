class BankAccount{

          static String userNm;
		  static String lastNm;
		  static String dob;
		  static String occpn;
		  static char gndr;
		  static long phNo;


public static boolean isCreateNewAccount(String userName , String lastName , String dateOfBirth , String occupation , char gender , long phoneNumber ){



              boolean isBankAccountDataCreated = true;

                   userNm = userName;
                   lastNm = lastName;
				   dob = dateOfBirth;
				   occpn = occupation;
				    gndr = gender;
				   phNo = phoneNumber;
				
                    return isBankAccountDataCreated;

}
                public static void getDeatils(){
	
	             System.out.println("The User Name Is = " + userNm);
				 System.out.println("The Last Name Is = " + lastNm);
				 System.out.println("The Date Of Birth Is = " + dob);
				 System.out.println("The Occupation Is = " + occpn);
				 System.out.println("The Gender Is = " + gndr);
				 System.out.println("The Phone Number Is = " + phNo);
	
                }

}