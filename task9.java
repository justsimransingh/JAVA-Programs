//Generate table of specified number
import java.util.Scanner;
class task8
{
public static void main(String[] args)
{
int i;
System.out.println("Enter a number");
int num=new Scanner(System.in).nextInt();
while(num>0)
{
System.out.println("table of the giver number is---");
for(i=1;i<=10;i++)
{
int table=num*i;
System.out.println(table);
}
System.out.println("Enter another number or press 0 to exit");
int x=new Scanner(System.in).nextInt();
num=x;
}
}
}
