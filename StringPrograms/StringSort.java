package StringPrograms;

public class StringSort {

	public static void main(String[] args) {
		String cities[]= {"Ahmedabad", "Kolkata", "Delhi", "Mumbai", "Chandigarh"};
		int len= cities.length;
		int i, j;
		System.out.println("Given Cities are: ");
		for(i=0; i<len; i++)
		{
			System.out.print(cities[i]+ ", "); 
		}
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if(cities[i].compareTo(cities[j])>0)
				{
					String x= cities[i];
					cities[i]= cities[j];
					cities[j]= x;
				}
			}
		}
		System.out.println();
		System.out.println( "Name of the Cities in Ascending Order: ");
		for(i=0; i<len; i++)
		{
			System.out.print(cities[i] + ", ");
		}
		System.out.println();
		System.out.println("Name of the Cities in Descending Order:");
		for(i=len-1; i>=0; i--)
		{
			System.out.print(cities[i]+", ");
		}

	}

}
