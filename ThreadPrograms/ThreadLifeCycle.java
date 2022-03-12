package ThreadPrograms;

import java.lang.Thread;

class X extends Thread
{
	public void run()
	{
		System.out.println("Thread X ");
		System.out.println("Elements in Thread X");
		for(int i =1; i<=5; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread X Completed.");
	}
}

class Y extends Thread
{
	public void run()
	{
		System.out.println("Thread Y ");
		System.out.println("Elements in Thread Y");
		for(int i =1; i<=5; i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread Y Completed.");
	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		X x = new X();
		Y y = new Y();
		
		x.start();
		x.yield();
		try {
			x.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		y.start();
		System.out.println("Main Thread End");
		
	}

}
