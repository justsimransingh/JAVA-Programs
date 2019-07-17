//Check whether a no is armstrong or not
import java.util.Scanner;
import java.lang.Math;
class task17
{
public static void main(String [] args)
{
int d=0,n,remainder,expo,y,temp,temp1,newx=0;
System.out.println("Enter a number");
int x=new Scanner(System.in).nextInt();
temp=x;
temp1=x;
while(x>0)
{
remainder=x%10;
x=x/10;
if(remainder!=0)
	d=d+1;
}
expo=d;
while(temp>0)
{
y=temp%10;
temp=temp/10;
newx+=Math.pow(y,expo);
}
if(temp1==newx)
	System.out.println("Number is armstrong");
else
	System.out.println("Number is not armstrong");
}
}
	