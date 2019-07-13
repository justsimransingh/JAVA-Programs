//Get the larest number among three numbers
import java.util.Scanner;
class task2
{
public static void main(String [] args)
{
System.out.println("Enter three numbers:");
int a = new Scanner(System.in).nextInt();
int b = new Scanner(System.in).nextInt();
int c = new Scanner(System.in).nextInt();
if(a>b && a>c)
{
System.out.println("First number is greatest");
}
else if(b>a && b>c)
{
System.out.println("Second number is greatest");
}
else 
{
System.out.println("Third number is greatest");
}
}
}

