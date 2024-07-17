class InstagramAccount{

        static String fstnm;
		static String lstnm;
		static String mail;
		static String passwd;
		static long phNo;
		static String gndr;



public static boolean isNewAccount(String firstName , String lastName , String email , String passWord , long phoneNumber , String gender  ){


          boolean isNewAccountDataCreated = false;

               fstnm = firstName;
			   lstnm = lastName;
			   mail = email;
			   passwd = passWord;
			   phNo = phoneNumber;
			   gndr = gender;


               return isNewAccountDataCreated;


}
      

	  public static void getDetails(){
		   
		   System.out.println("First Name is = " + fstnm);
		   System.out.println("Last name Is = " + lstnm);
		   System.out.println("Mail Is = " + mail);
		   System.out.println("PassWord is = " + passwd);
		   System.out.println("Phone Number Is = " + phNo);
		   System.out.println("Gender is = " + gndr);
		   
		   
		   
	   }




}