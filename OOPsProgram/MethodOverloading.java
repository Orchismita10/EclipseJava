package OOPsProgram;

import java.util.Scanner;

class Room2
{
	int length, breadth, area;
	Room2(int l)
	{
		length= breadth= l;
		System.out.print("Area of Square Room: ");
	}
	Room2(int l,int b)
	{
		length=l;
		breadth=b;
		System.out.print("Area of Rectangle Room: ");
	}	
    void roomArea()
	{
		System.out.println(length * breadth);
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		int length, breadth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = sc.nextInt();
		System.out.println("Enter the breadth: ");
		breadth = sc.nextInt();
		sc.close();
		Room2 r1 = new Room2(length);
		r1.roomArea();  
		Room2 r2 = new Room2(length, breadth);
		r2.roomArea();
	}	
}
