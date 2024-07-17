class LoanApplicationRunner{
	
	

public static void main(String []information){
      
              boolean isApplyLoanDataCreated = LoanApplication.applyLoan("IndianBank",50298887714L,800,2.0,"EducationLoan");
                 if(isApplyLoanDataCreated == true){
					 LoanApplication.getDetails();

					 
				 }else{
					 
					 System.out.println("The Provided Data Not Founded");
				 }
                 

} 

}