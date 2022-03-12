package BSc2ndSem;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int yr = sc.nextInt();
		sc.close();
		if( (yr%400==0) || ((yr%4==0) && (yr%100!=0)) )
			System.out.println(yr+" is a Leap Year.");
		else
			System.out.println(yr+" is not a Leap Year.");

	}

}
