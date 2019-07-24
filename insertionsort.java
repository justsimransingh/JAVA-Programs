//Insertion Sort
import java.util.Scanner;
class insertionsort
{
	public static void main(String[] args)
	{
		/*System.out.println("Enter the size of the array");
		int size=new Scanner(System.in).nextInt();
		int a[]=new int [size];*/
		int a[]={7,1,3,2,4};
		int i,j,temp=0;
		/*System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{	
			a[i]=new Scanner(System.in).nextInt();
		}*/
		for(j=1;j<5;j++)																									
		{
			temp=a[j];
			i=j-1;
			while((a[i]>temp) && (i>=0))
			{
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=temp;
		}
		System.out.println("Array elements after sorting");
		for(i=0;i<5;i++)
		{	
			System.out.println(a[i]);
		}
	}
}