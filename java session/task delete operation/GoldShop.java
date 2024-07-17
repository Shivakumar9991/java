import java.util.*;
class GoldShop{
       
	   static String goldItems []= {null,null,null,null,null,null,null};
	   static int index;
   
        public static boolean addGoldItems(String goldName){
		   System.out.println("Add Gold Items Started");
		  boolean isGoldItemsAdded = false;
		  if(index < goldItems.length ){
		  if(goldName!= null){
			     goldItems[index] = goldName;
				       index++ ;
					   isGoldItemsAdded  = true;
			  
		  }else{System.out.println("Items Cannot Be Null");}  
		  }else{
			  System.out.println("Place Is Already Filled");			  
		  }
	      System.out.println("Add Gold Items Ended");
		  return isGoldItemsAdded;
		}
      public static void getAllGoldItems(){
		  System.out.println("The Available Gold Items Are");
		  for(String goldItem : goldItems)
			    System.out.println(goldItem);
		  
	  }
	    public static boolean updateGoldItem (String oldName , String newName){
			System.out.println("Update Started");
			boolean isGoldItemsUpdated = false;
			for(int index = 0 ; index < goldItems.length ; index++){
				if(oldName == goldItems[index] ){
    					goldItems[index]= newName;
						 isGoldItemsUpdated = true;
						 
				}
				
			}
			if(isGoldItemsUpdated == false){
				System.out.println(oldName + "Not found");
			}
			System.out.println("Update Ended");
			return isGoldItemsUpdated;
		}
		public static boolean deleteGoldItems(String goldItemsToBeDeleted){
			System.out.println("Delete Gold Item Started");
			boolean isGoldItemsDeleted=false;
			int newIndex , oldIndex;
			for(newIndex = 0 , oldIndex =0; oldIndex<goldItems.length; oldIndex++){
				if(goldItems[oldIndex]!=goldItemsToBeDeleted){
					 goldItems[newIndex]=goldItems[oldIndex];
					 newIndex++;
					 isGoldItemsDeleted = true;
				}
			}
			   goldItems = Arrays.copyOf(goldItems , newIndex);
			   if(goldItems!=null){
				   isGoldItemsDeleted=true;
			   }
			    if(isGoldItemsDeleted==false){
					System.out.println(isGoldItemsDeleted+"Not found");
				}
				System.out.println("Delete Gold Item Ended");
				return isGoldItemsDeleted;
		}
	  
}
 