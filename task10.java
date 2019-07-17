//Check whether a number is prime or not
import java.util.Scanner;
class task10
{
	public static void main(String [] args)
	{
		int temp=0,x;
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		x=num;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is not prime");
				temp=1;
				break;
			}
		}
		if(temp==0 && x>1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}
