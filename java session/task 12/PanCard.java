class PanCard{
                 static String name;
				 static String fName;
				 static String dateOfBirth;
				 static long cellNumber;
				 static String permanentAddress;
 



public static boolean applyForPan(String fullName,String fatherName,String dob,long contactNumber,String address){
 boolean isPermanentAccountNumber=false;
              if(){
                name=fullName;
				 fName=fatherName;
				 dateOfBirth=dob;
			 cellNumber=contactNumber;
			 permanentAddress=address;
			  }      
 return isPermanentAccountNumber;
}
 public static void detailsOfPerson(){
 System.out.println("The Name is : " + name);
 System.out.println("The Father Name is :"+ fName);
 System.out.println("The Date of Birth :"+ dateOfBirth);
 System.out.println("The Conatact Number is :"+ cellNumber);
 System.out.println("The Address is :"+permanentAddress);
}
}