//Find the second greatest number among three numbers
import java.util.Scanner;
class task1
{
public static void main(String [] args)
{
System.out.println("Enter three numbers:");
int a = new Scanner(System.in).nextInt();
int b = new Scanner(System.in).nextInt();
int c = new Scanner(System.in).nextInt();
if( (a>b && a<c) || (a>c && a<b) )
{
System.out.print(a);
System.out.println("-is the second largest");
}
else if( (b>a && b<c) || (b>c && b<a) )
{
System.out.print(b);
System.out.println("-is the second largest");
}
else
{
System.out.print(c);
System.out.println("-is the second largest");
}
}
}