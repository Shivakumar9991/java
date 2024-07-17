class Factorial{
public static int fact(int toGetFactorial){
System.out.println("The Fact Method Started");

int fact=1;
for (int num=1; num<=toGetFactorial; num++){
fact = num * fact;


}
System.out.println("The Fact Method Ended");
return fact ;
}



}