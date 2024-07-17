import java.util.*;
class Gym{

       static String gymEquipments []= {null,null , null ,null ,null ,null ,null ,null};
	   static  int index ;


     public static boolean createGymEquipments(String equipment){
	  System.out.println("create Gym Equipment Started");
        boolean isGymEquipmentsCreated = false;
		if(index < gymEquipments.length){		
		if(equipment!=null){
			   gymEquipments[index] = equipment;
			        index++ ;
					isGymEquipmentsCreated = true;
        
		}else {System.out.println("Equipment name cannot be null");}
		
        }else{
			System.out.println("Place Is Already Filled");
			
		} 
		
		System.out.println("create Gym Equipment Ended");


             return isGymEquipmentsCreated;
     }
	 
	 
	 
	 
	 public static void getEquipments(){
		 System.out.println("The Available Gym Equipments Are :");
		 
		 for(String gymEquipment : gymEquipments )
			 System.out.println(gymEquipment);
		 
	 }
	  public static boolean updateGymEquipments(String oldName , String newName){
		  System.out.println("update Started");
		  boolean isEquipmentUpdated= false;
		  for(int index = 0; index < gymEquipments.length ; index++ ){
             if( oldName == gymEquipments[index]){
			     gymEquipments[index]= newName;
				    isEquipmentUpdated = true;
			   
		     }

	      }
	    if(isEquipmentUpdated == false){
			 System.out.println( oldName + "Not Found ");
		}
		System.out.println("update Ended");
		 return isEquipmentUpdated;
      }
	  public static boolean deleteEquipments(String equipmentToBeDelete){
		  System.out.println("Delete Equipment Started");
		  
		  boolean isEquipmentDeleted=false;
		  int newIndex  , oldIndex ;
		  for(newIndex = 0 , oldIndex = 0 ; oldIndex < gymEquipments.length ; oldIndex++){
			  if(equipmentToBeDelete!= gymEquipments[oldIndex]){
				    gymEquipments[newIndex]= gymEquipments[oldIndex];
					newIndex++;
					isEquipmentDeleted = true;
			  }
		  }
		  gymEquipments = Arrays.copyOf(gymEquipments , newIndex);
		  if(equipmentToBeDelete!= null){
			  isEquipmentDeleted = true;
		  }
		  if(isEquipmentDeleted==false){
			  System.out.println(equipmentToBeDelete+"Not Found");
		  }
		  System.out.println("Delete Equipment Ended");
		  return isEquipmentDeleted;
	  }
	  
	  
}