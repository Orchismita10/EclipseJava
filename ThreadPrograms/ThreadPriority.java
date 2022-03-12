package ThreadPrograms;

import java.lang.Thread;

class X1 extends Thread
{
	public void run()
	{
		System.out.println("Sart of Thread: X1");
		for(int i=1; i<=3; i++)
		{
			System.out.println("Value of Thread X1: "+i);
		}
		System.out.println("End of Thread: X1");
	}
}

class Y1 extends Thread
{
	public void run()
	{
		System.out.println("Sart of Thread: Y1");
		for(int i=6; i<=8; i++)
		{
			System.out.println("Value of Thread Y1: "+i);
		}
		System.out.println("End of Thread: Y1");
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		System.out.println("Sart of Thread: Main");
		X1 x1 = new X1();
		Y1 y1 = new Y1();
		
		System.out.println("Priority of Thread X: "+x1.getPriority());
		System.out.println("Priority of Thread Y: "+y1.getPriority());
		x1.start();
		y1.start();
		System.out.println("End of Thread: Main");

	}

}
