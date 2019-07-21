//Problem statement : Suppose you have an array like {20,6,40,15,5,7} and the output should be {0,1,0,0,0,1}
class task23
{
	public static void main(String[] args)
	{
		int a[]={20,6,40,15,5,7};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)
			{
				b[i]=0;
			}
			else
			{
				b[i]=1;
			}
			System.out.println(b[i]);
		}
	}
}