//Convert Calcius into Fahrenheit
import java.util.Scanner;
class task8
{
public static void main(String[] args)
{
System.out.println("Enter degrees in calcius");
float calcius=new Scanner(System.in).nextFloat();
double fahrenheit=(calcius*1.8)+32;
System.out.print("Entered degrees in farhrenheit-->");
System.out.print(fahrenheit);
}
}
