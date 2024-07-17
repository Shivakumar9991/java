class BarRunner{

        public static void main (String []items){
		
		        boolean add = Bar.addWineBrands("Fratelli Wines");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Sula");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("KRSMA");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Big Banyan");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("PenFolds");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Yellow Tail");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Charosa");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Grover Zampa");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Vallonne");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Banshee Wines");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Barefoot Cellars");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Catena Zapata");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Dai Red Wines");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("Egon Muller");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.addWineBrands("IB");
		               System.out.println("The Brand Name Is = " + add);
					   
					   Bar.getAllBrands();
					   
					    boolean updateBrand  = Bar.updateWineBrand("IB","Louis Roederer");
		               System.out.println("The Updated Brand Is = " + updateBrand);
					   
					    Bar.getAllBrands();
		}




}