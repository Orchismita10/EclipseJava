package Calculator;

import Calculator.OperatorsForCalculator;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		OperatorsForCalculator obj = new OperatorsForCalculator();
		System.out.println("Simple Calculator");
		System.out.println("How many numbers do you want to operate?");
		int n=sc.nextInt();
		System.out.println("Enter the operation:");
		int n1, n2;
		String c;
		for(int i=1; i<=n; i++) {	
			n1=sc.nextInt();
			c=sc.next();
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
		}
		
		sc.close();

	}

}
