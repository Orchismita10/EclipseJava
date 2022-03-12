package Calc2;

import Calc1.CalcOPERATIONS;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcOPERATIONS obj = new CalcOPERATIONS();
		System.out.println("Simple Calculator");
		int n1;
		System.out.println("Enter the first number:");
		n1=sc.nextInt();
		String c;
		System.out.println("Select "+"\n + for Addition,"
				+ " \n - for Subtraction,"+" \n * for Multiplication,"
				+ " \n / for Division");
		c=sc.next();
		int n2;
		System.out.println("Enter the second number:");
		n2=sc.nextInt();
		switch(c) {
		case "+":
			System.out.println(n1+c+n2+"="+obj.add(n1, n2));
			break;
		case "-":
			System.out.println(n1+c+n2+"="+obj.subtract(n1, n2));
			break;
		case "*":
			System.out.println(n1+c+n2+"="+obj.multiply(n1, n2));
			break;
		case "/":
			System.out.println(n1+c+n2+"="+obj.divide(n1, n2));
			break;
		default: 
			System.out.println("No Operations Available");
		}
		sc.close();

	}

}
