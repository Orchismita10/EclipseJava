package ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		int a = 5, x, y;
        int b = 0;
        int c =200;
        try {
            x =c/b;   
        }catch(Exception e) {
        	System.out.println("In this way Mathematical Rule can't be applied.");
			System.out.println(e);
        }
        y =c/a;
		System.out.println("Answer is = "+y);

	}

}
