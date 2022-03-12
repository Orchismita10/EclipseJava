package PracticePrograms;

import java.util.Scanner;

public class CountingVowelsAndConsonants {

	public static void main(String[] args) {
		int v=0, c=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		str = sc.nextLine();
		sc.close();
		str = str.toLowerCase();
		int n = str.length();
		for(int i =0; i<n; i++)
		{
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
			{
				v++;
			}
			else
				if((str.charAt(i)>='a') && (str.charAt(i)<='z'))
				{
					c++;
				}
		}
		System.out.println(" Number of Vowels in the Sentence is: "+v);
		System.out.println(" Number of Consonants in the Sentence is: "+c);

	}

}
