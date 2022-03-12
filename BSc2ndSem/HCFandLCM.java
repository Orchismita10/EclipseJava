package BSc2ndSem;

import java.util.Scanner;

public class HCFandLCM {

	public static void main(String[] args) {
		int t1, t2, n1, n2, temp, hcf, lcm;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number:");
		n1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		n2 = sc.nextInt();
		sc.close();
		t1=n1;
		t2=n2;
		while(t2!=0) {
			temp=t2;
			t2=t1%t2;
			t1=temp;
		}
		hcf=t1;
		lcm=(n1*n2)/hcf;
		System.out.println("HCF of "+n1+" and "+n2+" is: "+hcf);
		System.out.println("LCM of "+n1+" and "+n2+" is: "+lcm);


	}

}
