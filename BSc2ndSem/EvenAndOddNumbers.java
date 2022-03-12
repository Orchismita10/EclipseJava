package BSc2ndSem;

import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, x, y;
		System.out.println("Enter the lower limit: ");
		x=sc.nextInt();
		System.out.println("Enter the upper limit: ");
		y=sc.nextInt();
		sc.close();
	     System.out.println("Even Numbers are:");
	     for(i=x; i<y; i++)
	     {
	       if(i%2==0)
	         {
	            System.out.println(i);
	         }
	       }
	      System.out.println("Odd Numbers are:");
	      for(i=x; i<y; i++)
	      {
	           if(i%2!=0)
	           {
	            System.out.println(i);
	           }
	      } 

	}

}
