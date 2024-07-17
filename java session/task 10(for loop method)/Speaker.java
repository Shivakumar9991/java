class Speaker{
	static boolean isCharged;
	static int  currentVolume =10;
	static int  maxVolume = 50;
	static int minVolume = 0;
	
     public static void onOrOff(){
	    System.out.println("On Or off Started");
	     if (isCharged == false){
		   isCharged = true ;
		   System.out.println("The Speaker Is Turned on");
		   
		 }else{
		   if (isCharged == true){
		      isCharged = false;
			   System.out.println("The Speaker Is Turned Off");
			  return ;
		   }
		 
		 }
	 
	 
	 }
	 public static void increaseVolume(){
		 
		 System.out.println("The Speaker Volume Started");
		 if (isCharged= true){
			 if(currentVolume<=maxVolume){
				 currentVolume=currentVolume+10;
				 System.out.println("The Current Volume " + currentVolume);
				 
			 }else{
				 System.out.println("Reached maxVolume");
				 
				 
			 }
			      System.out.println("The Speaker Volume Ended");
			      return ;
		 }
	  
	 }
	   public static void decreaseVolume(){
		   System.out.println("The Speaker Volume Started");
		   if (isCharged=true){
			   if(currentVolume>minVolume){
				   currentVolume=currentVolume-20;
				   System.out.println("The Current Volume " + currentVolume);
				   
			   }else{
				   System.out.println("Reached minVolume");
				   
			   }
				   System.out.println("The Speaker Volume Ended");
				   return ;
			   
			   
		   }
	   }
	       public static void getInformation(){
			  System.out.println("Information Started"); 
			   String brandName = "JBL";
			   int price = 40000;
			   String colour = "Black";
			   System.out.println("The Brand Name is " + brandName);
			   System.out.println("The Price " + price);
			   System.out.println("The Brand Colour is " + colour);
			   
			  System.out.println("Information Ended"); 
		   }
	 
}