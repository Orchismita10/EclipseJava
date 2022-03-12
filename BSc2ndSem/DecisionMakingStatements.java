package BSc2ndSem;

public class DecisionMakingStatements {

	public static void main(String[] args) {
		System.out.println("Illustrating Break Statement");
		int i=0;
		while(i<10)
		{
			i++;
			System.out.println(i);
			if(i==5)
				break;
		}
		System.out.println("Loop Complete");
		System.out.println();
		System.out.println("Illustrating Continue Statement");
		int j=0;
		while(j<=10)
		{
			j++;
			if(j%2==1)
				continue;
			System.out.println(j);
		}
		System.out.println("Loop Complete");
		System.out.println();
		System.out.println("Illustrating Switch Statement");
		int day = 5;
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
