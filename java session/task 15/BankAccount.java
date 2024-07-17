class BankAccount{
	
	static double balance ;
public static void debit(double amount){
	       System.out.println("Debit Started");
		    if(amount <= balance)
				balance = balance - amount;
			else
		   
		  System.out.println("Insufficient balance");
		  System.out.println("Debit Ended");
		   
		  
		 return ;

}
        public static void  credit (double amount){
			System.out.println("Credit Started");
				if(amount > 0 ){
					balance = balance + amount;
				}else{
			
		     System.out.println("Amount can't be zero");
			System.out.println("Credit Ended");
			}
			
			return;
			
		}


          public static double  getBalance(){
			  
			  System.out.println("Facthing balance");
			  return balance;
			
			  
			  
		  } 
}