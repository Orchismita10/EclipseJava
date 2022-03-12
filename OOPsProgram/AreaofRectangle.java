package OOPsProgram;
import java.util.Scanner;

class Rect
{
	int length, breadth;
	void passdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = sc.nextInt();
		System.out.println("Enter the breadth: ");
		breadth = sc.nextInt();
		sc.close();
	}
	void rectArea()
	{
		int area;
		area = length*breadth;
		System.out.println("Area of Rectangle: "+area);
	}
}
public class AreaofRectangle 
{
	public static void main(String args[])
	{
		Rect rect = new Rect();
		rect.passdata();
		rect.rectArea();

	}

}
