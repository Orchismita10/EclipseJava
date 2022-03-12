package OOPsProgram;

class A
{
	void display()
	{
		System.out.println("WATCH");
	}
}
class B extends A
{
	void property()
	{
		System.out.println("TITAN");
	}
}
class C extends B
{
	void type()
	{
		System.out.println("RAGA");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		C c1= new C();
		c1.display();
		c1.property();
		c1.type();

	}

}
