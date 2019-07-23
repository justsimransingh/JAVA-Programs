import java.util.Scanner;
import java.util.Random;
class otp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int zap=ran.nextInt(1000) + 999;
		System.out.println("Dear user.Your OTP(One Time Password) is " + zap + " Please do not share the OTP with anyone for security reasons.");
		}
}