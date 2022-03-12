package BSc2ndSem;

public class SortingInAscendingAndDescendingOrder {
	public static void main(String[] args) {
		int num[]= {30,20,50,10,40};
		int i, j, len;
		len= num.length;
		System.out.println("Elements of the Array: ");
		for( i=0; i<len; i++)
		{
			System.out.print(num[i]+ " "); //Array Traversing
		}
		for( i=0; i<len; i++)
		{
			for(j= i+1; j<len; j++)
			{
				if(num[i] > num[j])
				{
					int x=num[i];
					num[i]=num[j];
					num[j]=x;  //Swapping Done	
				}
			}
		}
		System.out.println();
		System.out.println( "Elements of the Array in Ascending Order: ");
		for(i=0; i<len; i++)
		{
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println(" Elements of Array in Descending Order:");
		for(i=len-1; i>=0; i--)
		{
			System.out.print(num[i]+" ");
		}
	}
}
