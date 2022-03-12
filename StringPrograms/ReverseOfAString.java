package StringPrograms;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args) {
		String initial, rev="";
		int length, i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		initial=sc.nextLine();
		sc.close();
		length= initial.length();
		
		for(i=length-1; i>=0; i--)
		{
			rev+= initial.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
		if(initial.equals(rev))
		{
			System.out.println("The Entered String is Palindrome.");
		}
		else
		{
			System.out.println("The Entered String is not Palindrome.");
		}

	}

}
