import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int i, fact=1, n;
		System.out.println("Enter the no. of terms");
		 n=sc.nextInt(); 
		 for(i=1; i<=n; i++)
		 {
			 fact*=i;
		 }
	    System.out.println("Factorial of "+n+" is "+fact);	 
	}

}
