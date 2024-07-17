class GymRunner{
      public static void main(String[]addEquipment){
	  
	        boolean adds =Gym.createGymEquipments("Dumbbells");
			  System.out.println("The Gym Equipment is Added = "+ adds );
			  
			  adds = Gym.createGymEquipments("Bench");
			  System.out.println("The Gym Equipment is Added= " + adds);
			  
			  adds = Gym.createGymEquipments("Power Rack");
			  System.out.println("The Gym Equipment is Added = " + adds);
			  
			   adds = Gym.createGymEquipments("StairMaster");
			  System.out.println("The Gym Equipment is Added =" +adds);
			  
			   adds = Gym.createGymEquipments("ThreadMill");
			  System.out.println("The Gym Equipment is Added =" + adds);
			  
			   adds = Gym.createGymEquipments("DippingBars");
			  System.out.println("The Gym Equipment is Added =" + adds);
			  
			   adds = Gym.createGymEquipments("Ab Roller");
			  System.out.println("The Gym Equipment is Added =" + adds);
			  
			   adds = Gym.createGymEquipments("Barbell");
			  System.out.println("The Gym Equipment is Added =" + adds);
	  
	  
	        Gym.getEquipments();
	  }

}
