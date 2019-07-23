//Fibonacci series using recursion
class task25
{  
	static int a=0,b=1,c=0;    
	static void fibonacci(int x)
	{	    
		if(x>0)
		{    
			c = a + b;    
			a = b;    
			b = c;    
			System.out.println(c);   
			fibonacci(x-1);    
		}	    
	}    
	public static void main(String args[])
	{    
		int x=10;    
		System.out.println(a);
		System.out.println(b);
		fibonacci(x-2);
	}  
}  