import bank.*;
import java.util.Scanner;
class mona
{
	public static void main(String []arg)
	{
		boolean z=true;
		bank ob=new bank();
		System.out.println("Namaste! Welcome to MonaBank.");
		while(z){
		System.out.println("Already have an account?");
		System.out.println("If yes,Press 0 else Press 1 to create new");
		int ch=new Scanner(System.in).nextInt();
		if(ch==0)
		{
			System.out.println("Choose a request");
			System.out.println("1.Check Balance	2.Deposit Cash	3.Withdraw Cash");
			int r =new Scanner(System.in).nextInt();
			if(r==1)
			{
				ob.met1();
			}
			else if(r==2)
			{
				ob.met2();
			}
			else if(r==3)
			{
				ob.met3();
			}
			else
			{
				System.out.println("Please enter a valid request");
			}
		}
		else if(ch==1)
		{
			ob.met();
		}
		else
		{
			System.out.println("You entered wrong choice");
		}
		System.out.println("Thank you for using!");
		System.out.println("Press 1 to continue and press 0 to exit");
		int o=new Scanner(System.in).nextInt();
		if(o==1)
		{
			continue;
		}
		else
		{
			z=false;
		}
		}
	}
}