class WatchShop{

             static String watchNames [] = {null,null,null,null,null,null,null,null,null,null,};
			 static int index ;

            public static boolean addWatchBrandNames(String brandName){
			System.out.println("Add Brand Name Started");
			boolean isWatchNameAdded = false;
			if(index < watchNames.length){				
			  if(brandName!= null){
				    watchNames[index] = brandName;
					index++; 
					isWatchNameAdded = true;
			  }else{System.out.println("watch Name Cannot Be Null");}
				
			   }else{	
			       System.out.println("Place Is Already Filled");
			    }		
			System.out.println("Add Brand Name Ended");
			return isWatchNameAdded;
			
			}
             public static void getAllWatchBrands(){
				 System.out.println("The Available Watch Brands Are");
				 for(String watchName : watchNames )
				  System.out.println(watchName);
			 }
			 
			 public static boolean updateWatchBrand(String oldName , String newName){
				 System.out.println("Update Started");
				 boolean isWatchNameUpdated = false;
				 for(int index = 0 ; index < watchNames.length ; index++  ){
					 if(oldName == watchNames[index]){
						   watchNames[index]= newName;
						   isWatchNameUpdated = true;
					 }
				 }
				 if(isWatchNameUpdated ==  false){
					 System.out.println(oldName + "Not Found");
				 }
				 System.out.println("Update Ended");
				 return isWatchNameUpdated;
			 }
}