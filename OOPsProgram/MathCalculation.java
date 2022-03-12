package OOPsProgram;

import java.util.Scanner;

class MathOperation
{
	static int multiply(int x, int y )
	{
		int a= x*y ;
		return a;
	}
	static int division(int a, int z)
	{
		return a/z;
	}
}
public class MathCalculation {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y for Multiplication: ");
		x = sc.nextInt();
		y = sc.nextInt();
		int a = MathOperation.multiply(x , y);
		System.out.println("The Result of Multiplication: "+ a);
		System.out.println("Enter the value of z for Division: ");
		z = sc.nextInt();
		int b = MathOperation.division(a, z);
		System.out.println("The Result of Division: "+ b);
		sc.close();

	}

}
