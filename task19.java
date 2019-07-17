//Check whether a number is palindrome or not
import java.util.Scanner;
class task19
{
public static void main(String [] args)
{
int y,n=0,temp;
System.out.println("Enter a number");
int x=new Scanner(System.in).nextInt();
temp=x;
while(x>0)
{
	y=x%10;
	n=(n*10)+y;
	x=x/10;
}
if (temp==n)
		System.out.println("Number is palindrome");
else
System.out.println("Number is not palindrome");
}
}