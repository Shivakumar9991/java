class Microwave{
		static boolean isConnected= true;
		static int currentTemperature;
	    static int minTemperature;
		static int maxTemperature = 100;



public static void onOrOff(){
System.out.println("onOrOff started");
if (isConnected == false){
isConnected = true;

System.out.println("Microwave turned on");
}
else if (isConnected == true){
isConnected = false;
System.out.println(" Microwave turned off");
}
System.out.println("onOrOff ended");

return ; 
}

public static void increaseTemperature(){
	
	System.out.println(" Temperature Started");
	if (isConnected== true){
	if (currentTemperature<= maxTemperature){
		currentTemperature= currentTemperature+100;
		System.out.println("The Current Temperature" + currentTemperature );
		
	}else{
		System.out.println("Reached max Temperature");
		
	}
		System.out.println("Temperature ended");
		return;
	}
	
	}	
		public static void decreaseTemperature(){
			
				System.out.println("Temperature started");
			if (isConnected == true){
				if (currentTemperature>=minTemperature){
					currentTemperature=currentTemperature-80;
					System.out.println("The Current Temperature" + currentTemperature);			
				}else{
					System.out.println("Reached min Temperature");
				}
				System.out.println("Temperature ended");
					return;
			}
		}

         public static void getInformation(){
	     System.out.println("Information started"); 
		 
		 String name = "Philips";
		 int  price = 20000;
		 String colour = "Gray";
		 System.out.println("The Brand Name" + name);
		 System.out.println("The Brand Price" + price);
		 System.out.println("The Brand Colour" + colour);
          System.out.println("Information ended");		 
}






}


	
