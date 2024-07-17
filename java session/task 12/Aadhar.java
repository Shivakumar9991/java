class Aadhar{
                 static String candidateName;
				 static String candidateFatherName;
				 static String candidateDob;
				 static long candidateContactNumber;
				 static String candidateAddress;
 



public static boolean applyAadhar(String fullName,String fatherName,String dob,long contactNumber,String address){
 boolean isNewAadhaar=false;
 
                candidateName=fullName;
				 candidateFatherName=fatherName;
				 candidateDob=dob;
			 candidateContactNumber=contactNumber;
			 candidateAddress=address;
 
 return isNewAadhaar;
}
 public static void detailsOfApplier(){
 System.out.println("The Name is : " + candidateName);
 System.out.println("The Father Name is :"+ candidateFatherName);
 System.out.println("The Date of Birth :"+ candidateDob);
 System.out.println("The Conatact Number is :"+ candidateContactNumber);
 System.out.println("The Address is :"+ candidateAddress);
}
}