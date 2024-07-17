class DrivingLicence{
         
		  static String userNa;
		  static char gendr;
          static String dob;
           static long phoneNo;
           static String adrs;
            static String dateissue;



public static boolean getLicence(String userName , char gender , String dateOfBirth , long phoneNumber , String address , String dateOfIssue){

       boolean isDrivingLicenceDataCreated = false;
            userNa = userName;
            gendr = gender ;
             dob = dateOfBirth ;
             phoneNo = phoneNumber ;
              adrs = address;
              dateissue = dateOfIssue;
			  
			 return isDrivingLicenceDataCreated;
			 
			 
}			 
			  
			   public static void getDetails (){
				   
				  System.out.println("The User Name Is = " + userNa); 
				   System.out.println("The Gender Is = " + gendr);
				   System.out.println("The Date Of Birth Is = " + dob);
				   System.out.println("The Phone Number Is = " + phoneNo);
				   System.out.println("The Address Is = " + adrs);
				   System.out.println("The date Of Issue Is = " + dateissue);
				   
				   
				   
			   }
			  
			  



}