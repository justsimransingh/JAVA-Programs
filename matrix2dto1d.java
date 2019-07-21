import java.util.Scanner;
class matrix2dto1d
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 2-d array");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a1[][]=new int[r][c];
		System.out.println("Enter array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("2-d array elements are");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a1[i][j] + " ");
			}
				System.out.println();
		}
		System.out.println("1-d array elements are");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a1[i][j] + "    ");
			}
		}
	}
}