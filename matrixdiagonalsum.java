import java.util.Scanner;
class matrixdiagonalsum
{
	public static void main(String[] args)
	{
	int sum=0,sum1=0,row,col;
	System.out.println("Enter the size of the array");
	int size=new Scanner(System.in).nextInt();
	int a[][]=new int [size][size];
	System.out.println("Enter array elements");
	for(row=0;row<size;row++)
	{
		for (col=0;col<size;col++)
		{
			a[row][col]=new Scanner(System.in).nextInt();
		}
	}
	System.out.println("Matrix elements are");
	for(row=0;row<size;row++)
	{
		for (col=0;col<size;col++)
		{
			System.out.print(a[row][col] +" ");
		}
		System.out.println();
	}
	for(row=0;row<size;row++)
	{
		sum=sum+a[row][row];
	}
	System.out.println("Sum of diagonal from left top is " + sum);
	for(row=0;row<size;row++)
	{
		sum1+=a[row][size-row-1];
	}
	System.out.println("Sum of diagonal from right top is " + sum1);
	int result=sum+sum1;
	System.out.println("Sum of both diagonals " + result);
	}
}
