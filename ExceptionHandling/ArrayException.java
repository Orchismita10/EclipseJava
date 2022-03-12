package ExceptionHandling;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		int my_Array[] = new int [5];
		Scanner sc = new Scanner(System.in);
		int Length = my_Array . length;
		System.out.println("Enter Numbers: ");
		try {
			for(int i = 0 ; i <= Length ; i++) {
				my_Array[i] = sc.nextInt();
			}
		}catch(Exception e) {
			System.out.println("\nArray Bounds of Exception\n"+e);
		}
		sc.close();
		
	}

}
