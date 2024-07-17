class MobileShopRunner{

        public static void main (String [] models){
		
		    boolean adds = MobileShop.addModels("IPhone 11");
			  System.out.println("The Model Added To List =" + adds);
			   adds = MobileShop.addModels("IPhone 15");
			   System.out.println("The Model Added To List = " + adds);
			    adds = MobileShop.addModels("IPhone 16");
			   System.out.println("The Model Added To List = " + adds);
			    adds = MobileShop.addModels("IPhone 16+");
			   System.out.println("The Model Added To List = " + adds);
		         adds =  MobileShop.addPrice(42000.00);
				  System.out.println("The Price Added To List = " + adds);
				  

		            
		     MobileShop.getDeatils();
		}

         
}