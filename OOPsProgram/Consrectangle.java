package OOPsProgram;

class Rectangle1
{
	int length, breadth;
	Rectangle1()
	{
		length=30;
		breadth=40;
	}
	Rectangle1(int x, int y)
	{
		length =x;
		breadth = y;
	}
	void rectArea()
	{
		int area = length*breadth;
		System.out.println("Area of Rectangle :"+area);
	}
}
public class Consrectangle {

	public static void main(String[] args) {
		Rectangle1 rect1=new Rectangle1();
		rect1.rectArea();
		Rectangle1 rect=new Rectangle1(20,10);
		rect.rectArea();
	}

}
