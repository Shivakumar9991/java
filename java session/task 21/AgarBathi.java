class AgarBathi{
  
   String brandName;
   int agarBathiId;
   double price;
   String fragrance;
   int noOfSticks;
  
  
     
   public  boolean createAgarBathi(String brandName , int agarBathiId, double price , 
                                   String fragrance , int noOfSticks ){
									   
		boolean isAgarBathiCreated = false;
	      if(brandName !=null && agarBathiId>0 && price>0.0 && fragrance!= null &&noOfSticks>0 ){
			  
		  }
        	this.brandName = brandName;
	   	this.agarBathiId   =agarBathiId;
			    this.price = price;
			this.fragrance= fragrance;
			this.noOfSticks=noOfSticks;
			isAgarBathiCreated = true;
		 return isAgarBathiCreated ;
   }
    
         public void displayInfo(){
			 System.out.println("The Brand Name Is = " +this.brandName);
			 System.out.println("The Agarbathi Id Is = " +this.agarBathiId);
			 System.out.println("The Price IS = " + this.price);
			 System.out.println("The Fragrance IS = " +this.fragrance);
			 System.out.println("No Of Sticks Is = "+this.noOfSticks);
		 }

}