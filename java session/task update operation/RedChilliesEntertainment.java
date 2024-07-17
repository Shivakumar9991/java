class RedChilliesEntertainment{
         
      static String movieActors[]={null,null , null ,null ,null ,null ,null ,null ,null ,  };
	  static int index;
	  
	  
	  public static boolean addMovieActors(String heros){
	  
	      System.out.println("Add Movie Actors Started");
		  boolean isMovieActorsAdded = false;
		  if(index < movieActors.length){
		  if(heros!=null){
                       movieActors[index]  =  heros;
						    index++ ;
				   isMovieActorsAdded = true;
			  
		  }else{System.out.println("Name cannot Be Null");  }
			  
		  }else{
			  System.out.println("Place Is Already filled ");
	      }		  
		  
		  System.out.println("Add Movie Actors ended");
	  return isMovieActorsAdded;
	         
	  }
	  
              public static void getDetails(){
				  System.out.println("The Actors Selected for Movies");
				 for(String movieActor : movieActors)
				 System.out.println(movieActor);
			  
			  }

              public static boolean updateMovieActor(String oldName , String newName){
				  System.out.println("update Started");
				   boolean isMovieActorsUpdated = false ;
				   for( int index = 0 ; index < movieActors.length ; index++ ){
					  if(oldName == movieActors[index]){
						    movieActors[index]= newName;
							  isMovieActorsUpdated = true;
						  
					  } 
				   }
				   if (isMovieActorsUpdated == false){
					    System.out.println(oldName + "Not Found");
						
				   }
				   System.out.println("Update Ended");
				    return isMovieActorsUpdated;
				  
			  }
}