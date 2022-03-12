package BSc2ndSem;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Students in the batch: ");
		int n = sc.nextInt();
		System.out.println("Enter the marks of the Students:");
		int a[]= new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		int l = a.length;
		for(int i =0; i<l ; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				int rank =0;
				if( a[i]<a[j])
				{
					rank = a[i];
					a[i]=a[j];
					a[j]=rank;
				}
			}
		}
		System.out.println("Enter 1 for 1st, 2 for 2nd and 3 for 3rd");
		int k=sc.nextInt();
		switch(k)
		{
		case 1:
			System.out.println("The marks of the 1st position holder: "+a[0]);
			break;
		case 2:
			System.out.println("The marks of the 2st position holder: "+a[2]);
			break;
		case 3:
			System.out.println("The marks of the 3st position holder: "+a[3]);
			break;
		default:
			System.out.println("This student haven't ranked.");
		}
		sc.close();

	}

}
