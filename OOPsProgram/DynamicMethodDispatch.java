package OOPsProgram;

class X
{
	void m()
	{
		System.out.println("Method of A");
	}
}
class Y extends X
{
	void m()
	{
		System.out.println("Method of B");
	}
}
class Z extends Y
{
	void m()
	{
		System.out.println("Method of C");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		X a = new Y();
		a.m();
		Y b = new Z();
		b.m();
		
	}

}
