class SwiggyRunner{

       public static void main(String[]foodName){
     
        double finalValue = Swiggy.takeOrder("VegBiriyani");
        System.out.println("The VegBiriyani price is = " + finalValue);
       double finalPrice = Swiggy.takeOrder("PaneerButterMasala");
        System.out.println("The PaneerButterMasala price is = " + finalPrice);

		
		
}



}