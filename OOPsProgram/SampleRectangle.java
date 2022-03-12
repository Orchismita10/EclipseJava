package OOPsProgram;

class Rectangle
{
	int length, breadth;
	void passdata(int x, int y)
	{
		length=x;
		breadth=y;
	}
	void rectArea()
	{
		int area;
		area = length*breadth;
		System.out.println("Area of Rectangle "+area);
	}
}
class SampleRectangle
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		rect.passdata(20,10);
		rect.rectArea();
	}
}