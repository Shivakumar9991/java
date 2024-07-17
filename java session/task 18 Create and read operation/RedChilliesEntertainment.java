class RedChilliesEntertainment{
         
      static String movieActors[]={null,null , null ,null ,null ,null ,null ,null ,null ,  };
	  static int index;
	  
	  
	  public static boolean addMovieActors(String heros){
	  
	      System.out.println("Add Movie Actors Started");
		  boolean isMovieActorsAdded = false;
		  
		  if(heros!=null){
                       movieActors[index]  =  heros;
						    index++ ;
				   isMovieActorsAdded = true;
			  
		  }else{System.out.println("Name cannot Be Null");
			  
		  }
		  
		  System.out.println("Add Movie Actors ended");
	  return isMovieActorsAdded;
	         
	  }
	  
              public static void getDetails(){
				  System.out.println("The Actors Selected for Movies");
				 for(String movieActor : movieActors)
				 System.out.println(movieActor);
				  
				  
				  
			  }


}