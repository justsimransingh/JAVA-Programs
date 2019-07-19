//Compile time initialization of array elements
import java.util.Scanner;
class array4
{
	public static void main(String[] args)
	{
	System.out.println("Enter the size of the array");
	int size=new Scanner(System.in).nextInt();
	int a[]=new int [size];
	System.out.println("Enter array elements");
	for(int i=0;i<size;i++)
	{
		a[i]=new Scanner(System.in).nextInt();
	}
	System.out.println("Array elements are");
	for (int x : a)
	{
		System.out.println(x);
	}
	}
}	