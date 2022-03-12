package OOPsProgram;

import java.util.Scanner;
class Overloading 
{
	void check(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println(x + " is biggest Number");
		} else if (y > x && y > z) {
			System.out.println(y + " is biggest Number");
		} else {
			System.out.println(z + " is biggest Number");
		}
	}
	void check(int x, int y) {
		if (x > y) {
			System.out.println(x + " is biggest Number");
		} else {
			System.out.println(y + " is biggest Number");
		}
	}
}
public class BiggestNumberUsingMethodOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three  Number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter Two Number:");
		int e= sc.nextInt();
		int f = sc.nextInt();
		Overloading obj = new Overloading();
		obj.check(a, b, c);
		obj.check(e,f);
		sc.close();
	}
}
