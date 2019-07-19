//Bubble sort
import java.util.Scanner;
class bubblesort
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
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array elements after sorting");
		for (int x : a)
		{
			System.out.println(x);
		}
	}
}