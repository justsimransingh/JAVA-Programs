//Linear Search
import java.util.Scanner;
class linearsearch
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
		int temp=0;
		for(int i=0;i<size;i++)
			{
				if(a[i]==search)
					{
						temp=1;
					}
			}
		if(temp==1)
			{
				System.out.println("Number found");
			}
		else
			{
				System.out.println("Number not found");
			}
	}
}