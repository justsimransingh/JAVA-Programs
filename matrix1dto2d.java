import java.util.Scanner;
class matrix1dto2d
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1-d array");
		int size=sc.nextInt();
		int a1[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("1-d array elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("Enter size of 2-d array according to the size of 1-d array");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a2[][]=new int[r][c];
		if(r*c==size)
		{	
			int x=0;
			for(int i=0;i<r;i++)
			{	
				for(int j=0;j<c;j++)
				{	
					a2[i][j]=a1[x];
					x++;
				}
			}
			System.out.println("2-d array elements are");
			for(int i=0;i<r;i++)
			{	
				for(int j=0;j<c;j++)
				{
					System.out.print(a2[i][j]);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Size for 2-d array is not compatible");
		}
		
	}
}