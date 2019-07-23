//Sum of n natural numbers using recursion
import java.util.Scanner;
class task24
{
	public static int add(int x) 
	{
        if (x != 0)
			return x + add(x - 1);
        else
            return x;
    } 
	public static void main(String[] args) 
	{
        System.out.println("Enter a number upto which you want sum");
		int z = new Scanner(System.in).nextInt();
        int sum = add(z);
        System.out.println("Sum = " + sum);
    }
}