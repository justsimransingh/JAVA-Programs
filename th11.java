import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Worker implements Runnable
{
	public void run()
	{
		System.out.println("hello");
		System.out.println("bye");
		
	}
}
public class th11
{
	public static void main(String[] arg)
	{
		ExecutorService pool=Executors.newFixedThreadPool(5);
		Runnable r1=new Worker();
		Runnable r2=new Worker();
		Runnable r3=new Worker();
		Runnable r4=new Worker();
		Runnable r5=new Worker();
		pool.execute(r1);
	}
}