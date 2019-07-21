import java.util.Scanner;
class matrixinverse
{
	public static void main(String[] args)
	{	
		int temp=0;
		int inverse[][]=new int[3][3];
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int x[][]=new int [3][3];
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
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					x[i][j]=a[i][j];
				}
			}
		int determinant=a[0][0] * ((a[1][1]*a[2][2]) - (a[2][1]*a[1][2])) -a[0][1] * (a[1][0]* a[2][2] - a[2][0] * a[1][2]) + a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1]);
		if(determinant>0)
		{
			a[0][0]=(x[1][1]*x[2][2])-(x[1][2]*x[2][1]);
			a[0][1]=(x[1][0]*x[2][2])-(x[1][2]*x[2][0]);
			a[0][2]=(x[1][0]*x[2][1])-(x[1][1]*x[2][0]);
			a[1][0]=(x[0][1]*x[2][2])-(x[2][1]*x[0][2]);
			a[1][1]=(x[0][0]*x[2][2])-(x[0][2]*x[2][0]);
			a[1][2]=(x[0][0]*x[2][1])-(x[0][1]*x[2][0]);
			a[2][0]=(x[0][1]*x[1][2])-(x[0][2]*x[1][1]);
			a[2][1]=(x[0][0]*x[1][2])-(x[1][0]*x[0][2]);
			a[2][2]=(x[0][0]*x[1][1])-(x[1][0]*x[0][1]);
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					temp=i+j;
					if(temp%2==0)
					{
						continue;
					}
					a[i][j]=a[i][j]*(-1);
				}
			}
			System.out.println("Cofactor of given matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j] + "  ");
				}
				System.out.println();
			}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					b[j][i]=a[i][j];
				}
			}
			System.out.println("Adjoint of given matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(b[i][j] + "  ");
				}
				System.out.println();
			}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					inverse[i][j]=b[i][j]/determinant;
				}
			}
			System.out.println("Inverse of given matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(inverse[i][j] + "  ");
				}
				System.out.println();
			}
			
		}
		else
		{
			System.out.println("Cannot find the inverse as determinant is either zero or less than zero");
		}
	}
}