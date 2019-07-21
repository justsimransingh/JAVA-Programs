import java.util.Scanner;
class matrixdeterminant
{
	public static void main(String[] args)
	{
		int a[][]=new int [3][3];
		System.out.println("Enter array elements for a 3x3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=new Scanner(System.in).nextInt();
			}
		}
		System.out.println("Array elements are");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		long determinant=a[0][0] * ((a[1][1]*a[2][2]) - (a[2][1]*a[1][2])) -a[0][1] * (a[1][0]* a[2][2] - a[2][0] * a[1][2]) + a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1]);
		System.out.println("Determinant of given matrix is-->" + determinant);
	}
}
		
		
		