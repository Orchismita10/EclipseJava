package BSc2ndSem;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		 int n1=0, n2=1, n3=0, n, i; 
		 System.out.println("Enter the no. of terms");
		 n=sc.nextInt();   
		 sc.close();
		 System.out.print("Fibonacci Series: \n"+ n1 + " " +n2);  
		 for(i=2; i<=(n-1); ++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

	}

}
