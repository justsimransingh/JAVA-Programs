//Binary Search
import java.util.Scanner;
class binarysearch
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
		System.out.println("Enter the element you want to search");
		int search=new Scanner(System.in).nextInt();
		if(search<a[0] || search>a[size-1])
		{
			System.out.println("Number not found");
			exit(0);
		}
		int start=0;
		int stop=size-1;
		while(start<=stop)
		{
			int mid=(start+stop)/2;
			if(search==a[mid])
			{
				System.out.println("Number found");
				break;
			}
			if(search<a[mid])
			{
				stop=mid-1;
			}
			if(search>a[mid])
			{
				start=mid+1;
			}
		}
		if(start>stop)
		{
			System.out.println("Number not found");
		}
	}
}