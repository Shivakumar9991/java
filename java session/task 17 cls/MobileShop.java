class MobileShop{

          static String shopName = "AppleStore";
		  static String availablePhonesModels[]= {null , null , null ,null , null};
		  static int index ;
		  static double modelPrices[]={0.0 , 0.0 , 0.0 ,0.0 , 0.0};
		
		  
		  public static boolean addModels(String modelName){
		         System.out.println("Model Name Started");
				 boolean isModelNameAdded = false;
				 if(modelName != null){ 
				         availablePhonesModels[index] = modelName;
						            index++ ;
									
				                    isModelNameAdded = true;
				 }else{
					 
					 System.out.println("Model Name Cannot Be null...");
				  } 
					 System.out.println("Model Name Ended");
					 
					  return isModelNameAdded;
				
					 
		  
		  }
		  
		         public static boolean addPrice(double price){
					 System.out.println("Add Price Is Started ");
                   boolean isPriceAdded = false;
   
					  if(price > 0.0){
						  modelPrices[index] = price;
                                   index++ ;
						  
						  isPriceAdded = true;
						  
						  
					  }else System.out.println(" Provided Models Price Are Not Zero "); 
						  System.out.println("Add Price IS Ended");  
					  return isPriceAdded;
				 }
		  
		  
                public static void getDeatils(){
					
					System.out.println("The Available Models Are :");
					for(String availablePhonesModel : availablePhonesModels)
					
					System.out.println(availablePhonesModel);
					
				}




}