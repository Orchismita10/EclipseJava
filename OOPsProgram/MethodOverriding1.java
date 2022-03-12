package OOPsProgram;

import java.util.Scanner;

class DeluxeRoom
{
	int length, ar;
	DeluxeRoom(int l)
	{
		length=l;
		ar= l*l;
	}
	void area()
	{
		System.out.println("Area of Delux Room: "+ar);
	}
}
class Bedroom1 extends DeluxeRoom
{
	int breadth, area;
	Bedroom1(int l, int b)
	{
		super(l);
		breadth=b;
		area= l*b;	
	}
	void area()
	{
		System.out.println("Area of Bedroom: "+area);
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		int l, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		sc.close();
		Bedroom1 b1= new Bedroom1(l ,b);
		b1.area();
	}

}
