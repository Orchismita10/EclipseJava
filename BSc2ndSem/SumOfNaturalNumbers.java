package BSc2ndSem;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		 int i, n, sum=0; 
		 System.out.println("Enter the last natural number:");
		 n=sc.nextInt();
		 sc.close();
		 for(i=1; i<=n; i++)
		 {
			 sum+=i;
		 }
       System.out.println("Sum of first "+n+" natural numbers is: "+sum);
       

	}

}
