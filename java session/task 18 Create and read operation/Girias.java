class Girias{

    static String homeAppliances []={null,null,null,null,null,null,null,null,null,null,null,null,} ;
    static int index;
   
      public static boolean createHomeAppliances(String items){
	      System.out.println("Created Home Appliances Started");
		  boolean isHomeAppliancescreated = false;
		             
			if(items!=null){
				
			 homeAppliances[index] = items;
				 index++  ;
				 isHomeAppliancescreated = true;
			}else{System.out.println("Null Value Cannot be Added To List :");
				
			}
	  
	      System.out.println("Created Home Appliances Ended");
	  return isHomeAppliancescreated;
	  }
	  
	  public static void getDetails(){
		  
		  for(String homeAppliance : homeAppliances)
			  System.out.println(homeAppliance);
	  }
}