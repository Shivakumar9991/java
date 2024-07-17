class Blinkit{
    public static double takeOrder(String foodName){
	
	   if(foodName == "AlooGobi"){
	      return   50.00 ;
	   
	   }
	   if(foodName == "PaniPuri"){
	      return   30.00;
	   
	   }
	   if(foodName == "MalaiKofta"){
	      return  40.00 ;
	   
	   }
	   if(foodName == "VadaPav"){
	      return   30.00 ;
	   
	   }
	   if(foodName == "PavBajji"){
	      return  20.00 ;
	   
	   }
	   if(foodName == "Samosa"){
	      return   25.00 ;
	   
	   }
	   if(foodName == "RajmaMasala"){
	      return  80.00 ;
	   
	   }
	   if(foodName == "BindiMasala"){
	      return    60.00;
	   
	   }
	   if(foodName == "DahiPuri"){
	      return   20.00;
	   
	   }
	   if(foodName == "MutterPaneer"){
	      return  80.00 ;
	   
	   }
	   if(foodName == "PrawnCurry"){
	      return   50.00 ;
	   
	   }
	   if(foodName == "AlooParatha"){
	      return  30.00 ;
	   
	   }
	   if(foodName == "GobiManchuri"){
	      return  60.00 ;
	   
	   }
	   if(foodName == "Pesarattu"){
	      return 100.00 ;
	   
	   }
	   if(foodName == "Rasam"){
	      return  80.00 ;
	   
	   }
	   else{
		     System.out.println(foodName = "Not Found"); 
	   }
     return 0.0;
	}
	   
	public static double getOrder(String foodName, int quantity){
	
	   if(foodName == "AlooGobi"){
	      return   50.00 * quantity;
	   
	   }
	   if(foodName == "PaniPuri"){
	      return   30.00 * quantity;
	   
	   }
	   if(foodName == "MalaiKofta"){
	      return  40.00  * quantity;
	   
	   }
	   if(foodName == "VadaPav"){
	      return   30.00  * quantity;
	   
	   }
	   if(foodName == "PavBajji"){
	      return  20.00  * quantity;
	   
	   }
	   if(foodName == "Samosa"){
	      return   25.00 * quantity;
	   
	   }
	   if(foodName == "RajmaMasala"){
	      return  80.00 * quantity ;
	   
	   }
	   if(foodName == "BindiMasala"){
	      return    60.00 * quantity;
	   
	   }
	   if(foodName == "DahiPuri"){
	      return   20.00 * quantity;
	   
	   }
	   if(foodName == "MutterPaneer"){
	      return  80.00 * quantity;
	   
	   }
	   if(foodName == "PrawnCurry"){
	      return   50.00 * quantity;
	   
	   }
	   if(foodName == "AlooParatha"){
	      return  30.00 * quantity;
	   
	   }
	   if(foodName == "GobiManchuri"){
	      return  60.00 * quantity;
	   
	   }
	   if(foodName == "Pesarattu"){
	      return 100.00 * quantity;
	   
	   }
	   if(foodName == "Rasam"){
	      return  80.00 * quantity;
	   
	   }
	   else{
		   
		   System.out.println(foodName = "Not Found");
	   }   
		   
	 
	  return 0.0;
	}

 

}