class Telivision{
    static boolean isPower;
    static int currentChannelNumber = 450;
    static int maxChannelNumbers = 999;
	static int minChannelNumber = 0;
	
	public static void onOrOff(){
	System.out.println("On Or Off Started");
	    if (isPower == false){
		  isPower= true;
		  System.out.println("The TV Is Turned On");
		
		
		}else{
		    if (isPower==true){
			 isPower=false;
			System.out.println("The TV Is Turned Off");
			return;
			
			}	
		}
	}
	     public static void increaseChannelNumber(){
			 System.out.println("Changing Number Started");
			   if(isPower == true){
				  if(currentChannelNumber<=maxChannelNumbers){
					  currentChannelNumber=currentChannelNumber+99;
					System.out.println("The current Channel Number " + currentChannelNumber); 
					  
				  }else{
					  System.out.println("Reached maxChannelNumbers");
				  }
					  System.out.println("Changing Number Ended");
					  return;
				   
				   
			   }
			 
		 }
		   public static void decreaseChannelNumber(){
			   System.out.println("Changing Number Started");
			   
			   if(isPower== true){
				  if(currentChannelNumber>=minChannelNumber){
					  currentChannelNumber=currentChannelNumber-60;
					 System.out.println("Current Channel Number " + currentChannelNumber); 
					  
				  }else{
					  System.out.println("Reached minChannelNumber");
				  } 
					  System.out.println("Changing Number Ended");
					  return ;
				   
				   
			   }
			   
		   }
		    public static void getInformation(){
				System.out.println("Infornation Started");
				String brandName = "Sony";
				int brandPrice = 50000;
			    String brandColour = "Black";
				System.out.println("The Brand Name Is " + brandName);
				System.out.println("The Brand Price Is " + brandPrice);
				System.out.println("The Brand Colour Is " + brandColour);
				
				
				System.out.println("Information Ended");
			}

}