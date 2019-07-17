//Generate numbers which are divisible by 5 between 1 to 1000
class task12
{
	public static void main(String [] args)
	{
		int n1=1,n2=1000,n1new;
		for(n1new=n1+1;n1new<n2;n1new++)
		{
			if(n1new%5==0)
			{
				System.out.println(n1new);
			}
		}
	}
}