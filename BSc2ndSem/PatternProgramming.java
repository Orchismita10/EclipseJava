package BSc2ndSem;

import java.util.Scanner;

public class PatternProgramming {

	public static void main(String[] args) {
		int i, j, k, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. of Rows:");
		n = sc.nextInt();
		sc.close();
		System.out.println("Upper Left Triangle:");
		for(i=0; i<n; i++)
		{
			for(j=2*(n-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Upper Right Triangle:");
		for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Upper Full Triangle:");
		for(i=0; i<n; i++)
		{
			for(j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Reverse Left Triangle:");
		for(i=n-1; i>=0; i--)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Reverse Right Triangle:");
		for(i=n; i>=1; i--)
		{
			for(j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Reverse Full Triangle:");
		for(i=0; i<=n-1; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(k=0; k<=n-1-i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
