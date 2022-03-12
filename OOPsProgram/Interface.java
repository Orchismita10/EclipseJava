package OOPsProgram;

import java.util.Scanner;

interface Addition
{
	void add();
}
interface Subtraction
{
	void sub();
}

interface Calculation extends Addition, Subtraction
{
	void mul();
}
class Result implements Calculation
{
	int a,b;
	public void add()
	{
		int c = a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int c=  a-b;
		System.out.println(c);
	}
	public void mul()
	{
		int c= a*b;
		System.out.println(c);
	}
}

public class Interface {

	public static void main(String[] args) {
		int c, d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		c = sc.nextInt();
		System.out.println("Enter the value of b: ");
		d = sc.nextInt();
		sc.close();
		Result ob = new Result();
		ob.a = c;
		ob.b = d;
		ob.add();
		ob.sub();
		ob.mul();
		

	}

}
