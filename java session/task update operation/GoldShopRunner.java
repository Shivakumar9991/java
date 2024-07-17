class GoldShopRunner{

            public static void main (String [] items){
             boolean add = GoldShop.addGoldItems("Brbrooches");
			    System.out.println("Gold Items Added = " + add );
				
				add = GoldShop.addGoldItems("Rings");
			    System.out.println("Gold Items Added = " + add );

              add = GoldShop.addGoldItems("Necklaces");
			    System.out.println("Gold Items Added = " + add );

                 add = GoldShop.addGoldItems("Ear Rings");
			    System.out.println("Gold Items Added = " + add );

                 add = GoldShop.addGoldItems("Pendants");
			    System.out.println("Gold Items Added = " + add );

                   add = GoldShop.addGoldItems("Bracelets");
			    System.out.println("Gold Items Added = " + add );
  
                  add = GoldShop.addGoldItems("Cufflinks");
			    System.out.println("Gold Items Added = " + add );

              
            GoldShop.getAllGoldItems();
			
			boolean updateItem = GoldShop.updateGoldItem("Cufflinks","Bangles");
		        System.out.println("The New Item Updated = " + updateItem);
			
			
            GoldShop.getAllGoldItems();

            }
}