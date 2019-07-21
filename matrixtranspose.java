import java.util.Scanner;
class matrixtranspose
{
	public static void main(String[] args)
	{
	int row,col;
	System.out.println("Enter the size of rows and columns of the array");
	int sizeofrow=new Scanner(System.in).nextInt();
	int sizeofcol=new Scanner(System.in).nextInt();
	int a[][]=new int [sizeofrow][sizeofcol];
	int b[][]=new int [sizeofcol][sizeofrow];
	System.out.println("Enter array elements");
	for(row=0;row<sizeofrow;row++)
	{
		for (col=0;col<sizeofcol;col++)
		{
			a[row][col]=new Scanner(System.in).nextInt();
		}
	}
	System.out.println("Matrix elements are");
	for(row=0;row<sizeofrow;row++)
	{
		for (col=0;col<sizeofcol;col++)
		{
			System.out.print(a[row][col]);
		}
		System.out.println();
	}
	for(row=0;row<sizeofrow;row++)
	{
		for(col=0;col<sizeofcol;col++)
		{
			b[col][row]=a[row][col];
		}
	}
	System.out.println("Matrix elements after transpose are");
	for(row=0;row<sizeofcol;row++)
	{
		for (col=0;col<sizeofrow;col++)
		{
			System.out.print(b[row][col]);
		}
		System.out.println();
	}
	}
}