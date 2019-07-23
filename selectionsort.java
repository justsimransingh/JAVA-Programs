//Selection Sort
import java.util.Scanner;
class selectionsort
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of the array");
		int size=new Scanner(System.in).nextInt();
		int a[]=new int [size];
		int i,j,temp=0,pos=0,min=0;
		System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{	
			a[i]=new Scanner(System.in).nextInt();
		}
		for(i=0;i<size-1;i++)
		{
			min=a[i];
			pos=i;
			for(j=i+1;j<size;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					pos=j;
				}
			}
			temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
		System.out.println("Array elements after sorting:");
		for(i=0;i<size;i++)
		{	
			System.out.println(a[i]);
		}
	}
}