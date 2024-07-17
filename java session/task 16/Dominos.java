class Dominos{
    public static double takeOrder(String foodName){
	
	   if(foodName == "MargherataPizza"){
	      return  199 ;
	   
	   }
	   if(foodName == "pepperoniPizza"){
	      return  299   ;
	   
	   }
	   if(foodName == "VegetarianPizza"){
	      return  249  ;
	   
	   }
	   if(foodName == "HawaiianPizza"){
	      return   299 ;
	   
	   }
	   if(foodName == "ChickenSupremePizza"){
	      return  399 ;
	   
	   }
	   if(foodName == "BBQChickenPizza"){
	      return 699 ;
	   
	   }
	   if(foodName == "ExtravagnzaPizza"){
	      return  399  ;
	   
	   }
	   if(foodName == "PaneerMakhaniPizza"){
	      return  799  ;
	   
	   }
	   if(foodName == "CheeseburstPizza"){
	      return  349 ;
	   
	   }
	   if(foodName == "MaxicanGreenWavePizza"){
	      return   999 ;
	   
	   }
	   if(foodName == "CheeseGarlicBread"){
	      return     345  ;
	   
	   }
	   if(foodName == "SuffedGarlicBread"){
	      return  230;
	   
	   }
	   if(foodName == "GarlicBreadStick"){
	      return   50 ;
	   
	   }
	   if(foodName == "PotatoWedges"){
	      return  99  ;
	   
	   }
	   if(foodName == "ChickenWings"){
	      return  299  ;
	   
	   }
	   else{
		   System.out.println(foodName + "Not Found");
		     return 0.0;
	   }
	   
	  
	
	}



}