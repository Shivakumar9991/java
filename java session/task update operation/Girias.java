class Girias{

    static String homeAppliances []={null,null,null,null,null,null,null,null,null,null,null,null,} ;
    static int index;
   
      public static boolean createHomeAppliances(String items){
	      System.out.println("Created Home Appliances Started");
		  boolean isHomeAppliancescreated = false;
		    if(index < homeAppliances.length){         
			if(items!=null){
				
			 homeAppliances[index] = items;
				 index++  ;
				 isHomeAppliancescreated = true;
			}
			else{System.out.println("Null Value Cannot be Added To List :");}
				
			}
			else{System.out.println("place is already filled");
			}
	  
	      System.out.println("Created Home Appliances Ended");
	  return isHomeAppliancescreated;
	  }
	  
	  public static void getDetails(){
		  
		  for(String homeAppliance : homeAppliances)
			  System.out.println(homeAppliance);
	  }
	  
	  public static boolean updateHomeAppliances(String oldName , String newName){
		  System.out.println("update started");
		  boolean isItemNameUpdated = false;
		  for(int index = 0; index < homeAppliances.length ; index++ ){
			  if(oldName == homeAppliances[index]){
				   homeAppliances[index] = newName;
				     isItemNameUpdated = true;  
			  }
		  }
		  if(isItemNameUpdated == false){
			  System.out.println(oldName + "Not Found");
			  }
		  
		   System.out.println("update ended");
		   return isItemNameUpdated;
	  }
}