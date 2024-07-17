class Gym{

       static String gymEquipments []= {null,null , null ,null ,null ,null ,null ,null};
	   static  int index ;


     public static boolean createGymEquipments(String equipment){
	  System.out.println("create Gym Equipment Started");
        boolean isGymEquipmentsCreated = false;
		if(equipment!=null){
			   gymEquipments[index] = equipment;
			        index++ ;
					isGymEquipmentsCreated = true;

		}else System.out.println("Equipment name cannot be null");

		System.out.println("create Gym Equipment Ended");


             return isGymEquipmentsCreated;
     }
	 
	 
	 
	 
	 public static void getEquipments(){
		 System.out.println("The Available Gym Equipments Are :");
		 
		 for(String gymEquipment : gymEquipments )
			 System.out.println(gymEquipment);
			 
			 
		 
		 
	 }
}