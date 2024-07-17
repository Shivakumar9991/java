class Npr{
 //Npr = n!/(n-r)!;

static int n=6;
static int r=5;

public static int getFact(String npr[]){
int nprValue=Factorial.fact(n)/Factorial.fact(n-r);

System.out.println("npr is" + nprValue);
}

}