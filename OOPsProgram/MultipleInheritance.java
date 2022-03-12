package OOPsProgram;

import java.util.Scanner;

class Circle
{
	int r;
	Circle(int a)
	{
		r=a;
	}
	void CirArea()
	{
		double area = 3.14*r*r;
		System.out.println("Area of Circle: "+area);
	}
}
interface Square01
{
	void SqArea(); 
}
interface Rectangle01
{
	void RecArea();
}
interface Triangle
{
	void TriArea();
}
class Shapes extends Circle implements Rectangle01, Square01, Triangle
{
	int a, b;
	Shapes(int a, int b)
	{
		super(a);
		
	}
	public void SqArea()
	{
		int area = a*a;
		System.out.println("Area of Square: "+area);
	}
	public void RecArea()
	{
		int area = a*b;
		System.out.println("Area of Rectangle: "+area);
	}
	public void TriArea()
	{
		double area = 0.5*a*b;
		System.out.println("Area of Triangle: "+area);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		int c, d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		c = sc.nextInt();
		System.out.println("Enter the value of b: ");
		d = sc.nextInt();
		sc.close();
		Shapes s = new Shapes(c , d);
		//s.CirArea();
		s.a = c;
		s.CirArea();
		s.b = d;
		s.SqArea();
		s.RecArea();
		s.TriArea();
	}

}
