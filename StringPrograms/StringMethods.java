package StringPrograms;

public class StringMethods {

	public static void main(String[] args) {
		String str= "I am a Student";
		System.out.println(str);
		System.out.println(str.replace("am", "was"));
		//System.out.println(str.replaceAll("am", "was"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//System.out.println(str.substring(7, 14));
		int s1=str.indexOf("S");
		//int s2= str.length();
		//System.out.println(str.substring(s1, s2));
		//int s2= str.indexOf("t");
		String str2 = str.replaceFirst("t", " ");
		int s2=str2.indexOf("t");
		System.out.println(str.substring(s1, (s2+1)));

	}

}
