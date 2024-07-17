class Swiggy{

     public static double takeOrder(String foodName){

         if(foodName == "VegBiriyani"){
              return 299.00;
         }
         if(foodName == "PaneerButterMasala"){
		    return 99.00;
		 }
          if(foodName == "Malai Kofta"){
		     return 210.00;
		  
		  }
           if(foodName == "Dal Dry"){
		      return 130.00;
		   }
		   if(foodName == "Chapati"){
		     return 20.00;
		   }
		   if(foodName == "Roti Basket"){
		     return 300.00;
		   }
		   if(foodName == "Paratha"){
		     return 50.00;
		   }
		   if(foodName == "Butter Naan"){
		     return 30.00;
		   }
		   if(foodName == "Kulcha"){
		     return 40.00;
		   }
		   if(foodName == "Aloo Paratha"){
		     return 90.00;
		   }
		   if(foodName == "KajuKhurma"){
		     return 100.00;		   
		   }
		   if(foodName == "PalakPaneer" ){
		      return 80.00;
		   }
		   if(foodName == "Kofta"){
		     return 99.00;
		   }
		   if(foodName == "EggBurji"){
		    return 40.00;
		   }
		   if(foodName == "omelet"){
		     return 20.00;
		   }
		   else{
			   System.out.println(foodName + "Not Found");
			   
			   
		   }
		   return 0.0;
		   
		   
    }




 }