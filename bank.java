package bank;
import java.util.Scanner;
import java.util.Random;
public class bank
{
	static int cash=0;
	public void met()
	{
		System.out.println("Enter your name");
		String name=new Scanner(System.in).nextLine();
		Random ran=new Random();
		long accno=ran.nextInt(10000000) + 9999999;
		System.out.println("Your account no is:" + accno);
		System.out.println("Your account is created successfully.");
	}
	public void met1()
	{
		int temp=0;
		System.out.println("Enter your account number");
		long accno=new Scanner(System.in).nextLong();
		System.out.println("Your account balance is-" + cash);
	}
	public void met2()
	{
		System.out.println("Enter your account number");
		long accno=new Scanner(System.in).nextLong();
		System.out.println("Enter amount you want to deposit");
		int sal=new Scanner(System.in).nextInt();
		cash+=sal;
		System.out.println("Your account balance is-" + cash);
	}
	public void met3()
	{
		System.out.println("Enter your account number");
		long accno=new Scanner(System.in).nextLong();
		System.out.println("Enter amount you want to withdraw");
		int draw=new Scanner(System.in).nextInt();
		cash-=draw;
		System.out.println("Your account balance is-" + cash);
	}
}