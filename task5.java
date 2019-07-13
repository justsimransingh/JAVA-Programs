//Area of a rectangle
import java.util.Scanner;
class task5
{
public static void main(String[] args)
{
System.out.println("Enter the length of the rectangle");
float length=new Scanner(System.in).nextFloat();
System.out.println("Enter the breadth of the rectangle");
float breadth=new Scanner(System.in).nextFloat();
float area=length*breadth;
System.out.print("Area of the rectangle is :: ");
System.out.println(area);
}
}
