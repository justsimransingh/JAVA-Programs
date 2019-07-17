//Generate prime numbers between two numbers
import java.util.Scanner;
class task11
{
public static void main(String [] args)
{
int n,i;
System.out.println("Enter two numbers");
int n1=new Scanner(System.in).nextInt();
int n2=new Scanner(System.in).nextInt();
System.out.println("Prime numbers are");
for(n=n1+1;n<n2;n++)
{
for(i=2;i<=n;i++)
{
if(n%i==0)
{
break;
}
else
{
continue;
}
}
if(i==n)
{
System.out.println(n);
}
}
}
}
