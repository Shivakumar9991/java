class SuperBike{
		static boolean isConnected= true;
		static int currentSpeed;
			static int minSpeed;
			static int maxSpeed = 300;



public static void onOrOff(){
System.out.println("onOrOff started");
if(isConnected)= isConnected false ? true : false;

System.out.println("SuperBike turned on");


else if (isConnected == true){
isConnected = false;
System.out.println("SuperBike turned off");
}
System.out.println("onOrOff ended");

return ; 
}

public static void increaseSpeedLimit(){
	
	if (isConnected== true){
	System.out.println("Drag Race Started");
		
	if (currentSpeed<= maxSpeed){
		currentSpeed = currentSpeed+200;
		System.out.println("The Current Speed" + currentSpeed );
		
	}else{
		System.out.println("Reached max speed limit");
		
	}
		System.out.println("Drag race ended");
		return;
	}
	
	}	
		public static void decreaseSpeedLimit(){
			
			if (isConnected == true){
				System.out.println("Drag race started");
				if (currentSpeed>=minSpeed){
					currentSpeed=currentSpeed-100;
					System.out.println("The Current Speed" + currentSpeed);			
				}else{
					System.out.println("Reached min speed");
				}
				System.out.println("Drag race ended");
					return;
			}
		}

         public static void getInformation(){
	     System.out.println("Information started"); 
		 
		 String name = "ZX10R";
		 int  price = 2000000;
		 System.out.println("The Brand Name" + name);
		 System.out.println("The Brand Price" + price);
          System.out.println("Information ended");		 
}






}


	
