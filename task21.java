//Find maximun value from an array
import java.util.Scanner;
class task21
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
	int max=a[0];
	for(int i=0;i<size;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Maximum value is " +max);
	}
}