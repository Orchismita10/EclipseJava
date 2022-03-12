package OOPsProgram;

import java.util.Scanner;

interface Polygon
{
	void getArea();
}
class Rectangle5 implements Polygon
{
	int l, b;
	public void getArea()
	{
		int area= l*b;
		System.out.println("Area of Rectangle: "+area);	
	}
}
class Square implements Polygon
{
	int l, b;
	public void getArea()
	{
		if(l==b)
		{
			int area= l*b;
			System.out.println("Area of Square: "+area);
		}
		else
			System.out.println("Not Square.");
	}
}
public class Interface2 {

	public static void main(String[] args) {
		int c, d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of l: ");
		c = sc.nextInt();
		System.out.println("Enter the value of b: ");
		d = sc.nextInt();
		sc.close();
		Rectangle5 r = new Rectangle5();
		r.l = c;
		r.b= d;
		r.getArea();
		Square s = new Square();
		s.l=c;
		s.getArea();

	}

}
