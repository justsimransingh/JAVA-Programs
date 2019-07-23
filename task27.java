//Factorial using recursion
import java.util.Scanner;
class task27
{
	public static int fact(int x)
	{
		int f;
		if(x==0)
		{
			return 1;
		}
		else
		{
			f=x*fact(x-1);
			return f;
		}
	}
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter a number");
		a=new Scanner(System.in).nextInt();
		System.out.println(fact(a));
	}
}