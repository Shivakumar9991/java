class Bar{

      static String brandNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,};
	  static int index ;
	  

      public static boolean addWineBrands(String items){
	      System.out.println("The Brand Name Started");
		  boolean isBrandNameAdded = false;
		  if(index < brandNames.length){
		    if(items!= null){
			    brandNames[index]= items;
				   index++;
				   isBrandNameAdded = true;
			}else{
				System.out.println("The Item Should Not Be null");
			 }
		  }
		   else{System.out.println("The Item Place Is Already Full");
			 }
			 System.out.println("The Brand Name Ended");
		return isBrandNameAdded;
	  }
		
	  public static void getAllBrands(){
		  System.out.println("The Available Brand Names Are");
		  for(String brandName : brandNames)
		  System.out.println(brandName);
	  }
	  
	    public static boolean updateWineBrand(String oldBrand , String newBrand){
			System.out.println("Update Started");
			boolean isBrandNameUpdated = false;
			   for(int index= 0 ; index < brandNames.length ; index++ ){
				   if(oldBrand == brandNames[index]){
					     brandNames[index]= newBrand;
						  isBrandNameUpdated = true;
						  
				   }
			   }
			    if(isBrandNameUpdated == false){
					System.out.println(oldBrand + "Not Found");
				}
			
			System.out.println("Update Endeded");
			return isBrandNameUpdated;
		}

}