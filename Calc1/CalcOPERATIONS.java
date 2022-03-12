package Calc1;

public class CalcOPERATIONS {
	public double add(double a, double b) {
		return a+b;
	}
	public double subtract(double a, double b) {
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	public double divide(double a, double b) {
		return a/b;
	}

}
