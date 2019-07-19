//Updation of array
import java.util.Scanner;
class array5
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
	System.out.println("Enter update index");
	int index=new Scanner(System.in).nextInt();
	System.out.println("Enter new element");
	int ele=new Scanner(System.in).nextInt();
	a[index-1]=ele;
	System.out.println("New array:");
	for (int x : a)
	{
		System.out.println(x);
	}
	}
}	