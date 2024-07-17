class LoanApplication{


              static String  bankNameIs;
			  static long accountNoIs;
			  static int creditScoreIs;
			  static double interestIs;
			  static String loanTypeIs;


public static boolean applyLoan(String bankName , long bankAccountNo , int creditScore , double rateOfInterest , String loanType  ){

              boolean isApplyLoanDataCreated = false ; 
               boolean isBankNameValid = false;
			   boolean isAccountNoValid = false;
			   boolean isCreditScoreValid =false;
			   boolean isRateOfInterestValid = false;
			   boolean isLoanTypeValid = false;
			 
			   
                  if(bankName!= null){
				       bankNameIs = bankName;
					   isBankNameValid = true;
				 
				  }else{
					 System.out.println("Please Provide Valid Name");
					  
				  }
				  if(bankAccountNo > 0){
				        accountNoIs = bankAccountNo;
						isAccountNoValid = true;
					  
				  }else{
					  System.out.println ("Please Provide Valid Account No");
					  
				  }
				   if(creditScore > 500 ){
				        creditScoreIs = creditScore;
						isCreditScoreValid = true;
					   
				   }else{
					  System.out.println("To Apply the Loan Your Credit Score Must Be More Then 500"); 
					   
				   }
				   if(rateOfInterest > 0){
				       interestIs = rateOfInterest;
					  isRateOfInterestValid = true;
					   
				   }else{
					  System.out.println("Please Provide Valid Interest"); 
				   }
				   if (loanType!= null){
				        loanTypeIs = loanType;
						isLoanTypeValid = true;
					   
				   }else{
					   System.out.println("Please Provide Valid Loan Type");
					   
				   }
				   if(isBankNameValid && isAccountNoValid && isCreditScoreValid && isRateOfInterestValid && isLoanTypeValid ){
					   
					   isApplyLoanDataCreated = true;
				   }
					  
				  return isApplyLoanDataCreated;



}
               public static void getDetails (){
				   
				   System.out.println("Bank Name Is = " + bankNameIs);
				   System.out.println("Bank Account NO = " + accountNoIs);
				   System.out.println("Credit Score Is = " + creditScoreIs);
				   System.out.println("Rate Of Interst Is = " + interestIs);
				   System.out.println("Loan Type Is = " + loanTypeIs);
				   
				   
				   
				   
			   }

}