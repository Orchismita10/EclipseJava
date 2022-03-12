package BSc2ndSem;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int n1, n2, t1, t2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		n1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		n2 = sc.nextInt();
		sc.close();
		t1=n1;
		t2=n2;
		while(n1 != n2) {
			if(n1>n2) {
				n1-=n2;
			}
			else
			{
				n2-=n1;
			}
		}
        System.out.println("GCD of "+t1+" and "+t2+" is: "+n2);
        

	}

}
