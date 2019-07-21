import java.util.Scanner;
class matrixsumofrowsandcolumns
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the size of rows and columns of the array");
		int sizeofrow=new Scanner(System.in).nextInt();
		int sizeofcol=new Scanner(System.in).nextInt();
		int a[][]=new int [sizeofrow][sizeofcol];
		int b[][]=new int [sizeofrow][sizeofcol];
		System.out.println("Enter array elements");
		for(int row=0;row<sizeofrow;row++)
		{
			for (int col=0;col<sizeofcol;col++)
			{
				a[row][col]=new Scanner(System.in).nextInt();
			}
		}
		for(int row=0;row<sizeofrow;row++)
		{	
			int sum=0;
			System.out.print("Sum of row " + (row+1) + " is->");
			for (int col=0;col<sizeofcol;col++)
			{
				sum+=a[row][col];
			}
			System.out.println(sum);
		}
		for (int col=0;col<sizeofcol;col++)
		{	
			int sum=0;
			System.out.print("Sum of column " + (col+1) + " is->");
			for(int row=0;row<sizeofrow;row++)
			{
				sum+=a[row][col];
			}
			System.out.println(sum);
		}
	
	}
}