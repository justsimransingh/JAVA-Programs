//Prime numbers using recursion
import java.util.Scanner;
public class task26 
{
    public static void main(String[] args) 
    {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
		if(n>1)
		{
			task26 obj = new task26();
			x = obj.prime(n, 2);
			if(x == 1)
			{
				System.out.println(n+" is prime number");
			}
			else
			{
				System.out.println(n+" is not prime number");
			}
		}
		else
			System.out.println(n+" is not prime number");
	}
    int prime(int a,int b)
    {
         if(b < a)
        {
            if(a % b != 0) 
            {
                return(prime(a, ++b));
            } 
            else
            {
                return 0; 
            }
        }
        return 1;
    }
}