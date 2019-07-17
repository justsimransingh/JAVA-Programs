//Armstrong no between a given range
import java.util.Scanner;
class task18
{
public static void main(String [] args)
{
int temp,rem,newn1n=0;
System.out.println("Enter the range");
int n1=new Scanner(System.in).nextInt();
int n2=new Scanner(System.in).nextInt();
System.out.println("Armstrong numbers between the given range is ");
for(int n1n=n1+1;n1n<n2;n1n++)
{
	temp=n1n;
	while(temp>0)
	{
		rem=temp%10;
		newn1n=(int)(newn1n+Math.pow(rem,(Integer.toString(n1n).length())));
		temp=temp/10;
	}
	if(newn1n==n1n)
		System.out.println(n1n);
	newn1n=0;
}
}
}
		
