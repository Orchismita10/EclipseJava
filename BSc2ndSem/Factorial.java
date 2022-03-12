package BSc2ndSem;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int i, fact=1, n;
		System.out.println("Enter the no. of terms");
		 n=sc.nextInt(); 
		 sc.close();
		 for(i=1; i<=n; i++)
		 {
			 fact*=i;
		 }
	    System.out.println("Factorial of "+n+" is: "+fact);	 

	}

}
