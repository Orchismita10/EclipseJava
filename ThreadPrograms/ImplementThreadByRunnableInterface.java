package ThreadPrograms;
import java.lang.Thread;
class C1 implements Runnable
{
	public void run()
	{
		System.out.println("Sarting  of Thread C1");
		for(int i=0; i<=5; i++)
		{
			System.out.println("From Thread C1: "+i);
		}
		System.out.println("End of Thread C1");
	}
}
class C2 implements Runnable
{
	public void run()
	{
		System.out.println("Sarting  of Thread C2");
		for(int j=0; j<=5; j++)
		{
			System.out.println("From Thread C2: "+j);
		}
		System.out.println("End of Thread C2");
	}
}
public class ImplementThreadByRunnableInterface {
	public static void main(String[] args) {
		System.out.println("Sart of Thread: Main");
		C1 c1 = new C1();
		C2 c2 = new C2();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		System.out.println("End of Thread: Main");
	}
}
