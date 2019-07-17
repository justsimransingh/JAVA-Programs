//Generate prime numbers between two numbers
import java.util.Scanner;
class task11
{
public static void main(String [] args)
{
int n1n,i;
System.out.println("Enter two numbers");
int n1=new Scanner(System.in).nextInt();
int n2=new Scanner(System.in).nextInt();
System.out.println("Prime numbers are");
for(n1n=n1+1;n1n<n2;n1n++)
{
for(i=2;i<n1n;i++)
{
if(n1n%i==0)
{
break;
}
else if(i==n1n)
{
System.out.println(n1n);
}
}
}
}
}
