class WatchShopRunner{

        public static void main (String [] brands){
		
		
		           boolean add = WatchShop.addWatchBrandNames("HMT");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Fastrack");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Rolex");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Samsung");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Realme");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Boat");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Apple");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Sonata");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Casio");
				     System.out.println("The Brand Name Is = " + add);
					 
					 add = WatchShop.addWatchBrandNames("Breitling");
				     System.out.println("The Brand Name Is = " + add);
					 
					 WatchShop.getAllWatchBrands();
					 
					 boolean updateBrand = WatchShop.updateWatchBrand("Breitling","Cartier");
					   System.out.println("The Brand Name Updated = " + updateBrand);
					 
					 WatchShop.getAllWatchBrands();
		
		}
	
}