class Textiles{
          
		  static String clothNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,};
          static  int index ;
		  
       public static boolean addMaterials(String names){
		   System.out.println("Textiles name started");
		  boolean isMaterialsAdded = false;
          if(index < clothNames.length ){
			  if(names!=null){
				      clothNames[index] =names;
					         index++ ;
				   isMaterialsAdded = true;
			  
			  }else{
				    Syste.out.println("The Textilse Name Cannot be Null");
			  }
		  }	else{
			     System.out.println("The List Already Full");
		  }	  
		  
		   System.out.println("Textiles name ended");
		   return isMaterialsAdded;
		   
	   }
	       public static void getAllMaterialInfo(){
			   
			   System.out.println("The Available Textiles Are");
			   for(String clothName : clothNames)
				   System.out.println(clothName)
			   
		   }
		   
		    public static boolean updateMaerial(String oldMaterial , String newMaterial){
				   System.out.println("Update Started");
				   
				   boolean isMaterialUpdated = false;
				     for(int index  = 0 ; index < clothNames.length; index++ ){
						 if(oldMaterial == clothNames[index]){
							        clothNames[index]= newMaterial;
									  isMaterialUpdated = true;
									  
						 }
						 
					 }
					      if(isMaterialUpdated==false){
							  System.out.println(oldMaterial + "Not Found");
				          }
				   System.out.println("Update Ended");
				return isMaterialUpdated;
			}

}