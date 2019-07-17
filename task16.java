//Calculate number of digits
import java.util.Scanner;
class task16
{
public static void main(String [] args)
{
int d=0,n,remainder;
System.out.println("Enter a number");
int x=new Scanner(System.in).nextInt();
while(x>0)
{
remainder=x%10;
x=x/10;
if(remainder!=0)
{
d=d+1;
}
}
System.out.println("no of digits" +d);
}
}
	
