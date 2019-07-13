//Swapping of two numbers without using third variable
import java.util.Scanner;
class task7
{
public static void main(String[] args)
{
System.out.println("Enter first number");
int a=new Scanner(System.in).nextInt();
System.out.println("Enter second number");
int b=new Scanner(System.in).nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("Numbers after swapping are-->>");
System.out.print("Value of a="); 
System.out.println(a);
System.out.print("Value of b=");
System.out.println(b);
}
}
