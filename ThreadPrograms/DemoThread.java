package ThreadPrograms;

import java.lang.Thread;

class A extends Thread
{
	public void run()
	{
		System.out.println("Sart of Thread: A");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Value of Thread A: "+i);
		}
		System.out.println("End of Thread: A");
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("Sart of Thread: B");
		for(int i=6; i<=10; i++)
		{
			System.out.println("Value of Thread B: "+i);
		}
		System.out.println("End of Thread: B");
	}
}

public class DemoThread {

	public static void main(String[] args) {
		System.out.println("Sart of Thread: Main");
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();
		System.out.println("End of Thread: Main");

	}

}
