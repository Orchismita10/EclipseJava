package OOPsProgram;
import java.util.Scanner;

class Parent
{
	int l, b;
	void plotCalculate(int x, int y)
	{
		l=x;
		b=y;
		int area= l*b;
		System.out.println("Area of the plot: "+area);
	}
}
class Child extends Parent
{
	void plotCalculate(int x , int y)
	{
		int perimeter = 2*(x+y);
		System.out.println(" Perimeter of the plot: "+ perimeter);
		
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		int l, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		sc.close();
		Child c1= new Child();
		c1.plotCalculate(l, b);
	}

}
