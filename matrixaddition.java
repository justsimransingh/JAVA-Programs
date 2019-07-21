import java.util.Scanner;
class matrixaddition
{
	public static void main(String[] args)
	{
	System.out.println("Enter the size of rows and columns of the array");
	int sizeofrow=new Scanner(System.in).nextInt();
	int sizeofcol=new Scanner(System.in).nextInt();
	int a[][]=new int [sizeofrow][sizeofcol];
	int b[][]=new int [sizeofrow][sizeofcol];
	int c[][]=new int [sizeofrow][sizeofcol];
	System.out.println("Enter array elements");
	for(int row=0;row<sizeofrow;row++)
	{
		for (int col=0;col<sizeofcol;col++)
		{
			a[row][col]=new Scanner(System.in).nextInt();
		}
	}
	System.out.println("Enter next array elements");
	for(int row=0;row<sizeofrow;row++)
	{
		for (int col=0;col<sizeofcol;col++)
		{
			b[row][col]=new Scanner(System.in).nextInt();
		}
	}
	for(int row=0;row<sizeofrow;row++)
	{
		for (int col=0;col<sizeofcol;col++)
		{
			c[row][col]=a[row][col]+b[row][col];
		}
	}
	System.out.println("Matrix elements are");
	for(int row=0;row<sizeofrow;row++)
	{
		for (int col=0;col<sizeofcol;col++)
		{
			System.out.print(c[row][col]);
		}
		System.out.println();
	}
	}
}	