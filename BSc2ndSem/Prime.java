package BSc2ndSem;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, x, y, prime=0;
		System.out.println("Enter the lower limit: ");
		x=sc.nextInt();
		System.out.println("Enter the upper limit: ");
		y=sc.nextInt();
		sc.close();
	    System.out.println(" Prime Numbers are:");
	    for(i=x;i<y;i++)
	     {
	        for(j=2;j<(i/2);j++)
	         {
	            if(i%j==0)
	             {
	                prime++;
	             }
	         }
	        if(prime==0)
	        {
	            System.out.println(i);
	        } 
	        prime=0;
	     } 

	}

}
