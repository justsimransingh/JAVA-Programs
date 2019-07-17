//Square root of a given number
import java.util.Scanner;
import java.lang.Math;
class task15
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Square root of given number is " + Math.sqrt(a));
	}
}