package PracticePrograms;

import java.util.Scanner;

class Addition
{
	void add(float a, float b)
	{
		float sum = a + b;
		System.out.println(a+" + "+b+" = "+ sum);
	}
}

class Subtraction
{
	void sub(float a, float b)
	{
		float diff;
		if(b>a)
		{
			diff = b-a;
			System.out.println(b+" - "+a+" = "+ diff);
		}
		else
		{
			diff = a-b;
			System.out.println(a+" - "+b+" = "+ diff);
		}
	}
}

class Multiplication
{
	void mul(float a, float b)
	{
		float product = a*b;
		System.out.println(a+" * "+b+" = "+ product);
	}
}

class Division
{
	void div(float a, float b)
	{
		float quotient = a/b;
		System.out.println(a+" / "+b+" = "+ quotient);
	}
}

public class SimpleCalculator {

	public static void main(String[] args) {
		char operator;
		float a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an Operator: =, -, * or / ");
		operator = sc.next().charAt(0);
		System.out.println("Enter the 1st number: ");
		a= sc.nextFloat();
		System.out.println("Enter the 2nd number: ");
		b= sc.nextFloat();
		sc.close();
		switch(operator) {
		case '+':
			Addition n1 = new Addition();
			n1.add(a, b);
			break;
		case '-':
			Subtraction n2 = new Subtraction();
			n2.sub(a, b);
			break;
		case '*':
			Multiplication n3 = new Multiplication();
			n3.mul(a, b);
			break;
		case '/':
			Division n4 = new Division();
			n4.div(a, b);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		
	}

}
