class MyntraRunner{
public static void main (String [] information){

        boolean isAccountCreatedSuccessfully = Myntra.createAccount ("Channaveer" , 9632084956L , "channu1123@gmail.com" , "Channu69" , "Ram nagar" , 585103);

           if(isAccountCreatedSuccessfully = true){
			   Myntra.getDeatils();
			   
		   }else{
			   
			   System.out.println("The Provided Data Is Not Founded");
		   }
             

}
}