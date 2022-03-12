package PracticePrograms;

import java.util.Scanner;

public class LargestNumberInAnArray {

	public static void main(String[] args) {
		int n, large;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Elements In the Array: ");
		n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the Elements of the Array: ");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		large=a[0];
		for(int i=0; i<n; i++)
		{
			if(large<a[i])
			{
				large = a[i];
			}
		}
		System.out.println("The Largest Number in the Array is: "+large);
		sc.close();

	}

}
