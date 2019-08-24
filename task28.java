import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Random;
class task28
{
	public static void main(String[] args)
	{	
		try
		{
			FileOutputStream ob=new FileOutputStream("student.txt");
			System.out.println("Enter total number of students");
			int total=new Scanner(System.in).nextInt();
			if(total>0)
			{
				String name[]=new String[total];
				String roll_no[]=new String[total];
				for(int i=0;i<total;++i)
				{	
					System.out.println("Enter name and roll_no  of Student " + (i+1));
					name[i]=new Scanner(System.in).nextLine();
					//byte []n=name.getBytes();
					roll_no[i]=new Scanner(System.in).nextLine();
					//byte []r=roll_no.getBytes();
					//ob.write(n);
					//ob.write(r);
					int marks[]=new int[3];
					Random ran=new Random();
					int e=ran.nextInt(100) + 0;
					int h=ran.nextInt(100) + 0;
					int m=ran.nextInt(100) + 0;
					marks[0]=e;
					marks[1]=h;
					marks[2]=m;
					System.out.println("Marks obtained in English,Hindi and Maths are:");
					int res=0,sum;
					for(int j =0;j<3;j++)
					{
						System.out.println(marks[j]);
						res+=marks[j];
						
					}
					sum=res/4;
					if(sum>=85 && sum<=100)
					{
						String u="You scored A";
						byte []A=u.getBytes();
						ob.write(A);
					}
					else if(sum>=65 && sum<85)
					{
						String w="You scored B";
						byte []B=w.getBytes();
						ob.write(B);
					}
					else if(sum>=45 && sum<65)
					{
						String x="You scored C";
						byte []C=x.getBytes();
						ob.write(C);
					}
					else
					{
						String y="FAIL....!";
						byte []F=y.getBytes();
						ob.write(F);
					}
					
				}
				ob.close();
			}
			
			else
			{
				String z="This class has no student";		
				byte []zero=z.getBytes();
				ob.write(zero);
			}
		}
		catch(Exception e)
		{
			System.out.println("File not found" + e);
		}
		
	}
}

			