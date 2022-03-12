package OOPsProgram;

import java.util.Scanner;

class Room
{
	int length, breadth;
	Room(int l,int b)
	{
		length=l;
		breadth=b;
	}	
    void roomArea()
	{
    	int area= length * breadth;
    	System.out.print("Area of Room: "+area);
	} 
}
class Bedroom extends Room
{
	int height;
	Bedroom(int l, int b, int h)
	{
		super(l, b);
		height=h;
	}
	void roomVolume()
	{
		int volume = length*breadth*height;
		System.out.println("Volume of the Room: "+volume);
	}
}

public class DemoInheritance {

	public static void main(String[] args) {
		int l, b, h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		System.out.println("Enter the height: ");
		h = sc.nextInt();
		sc.close();
		Bedroom r1 = new Bedroom(l, b, h);
		r1.roomArea();
		System.out.println();
		r1.roomVolume();

	}

}
