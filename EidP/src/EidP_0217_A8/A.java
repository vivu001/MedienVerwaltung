package EidP_0217_A8;

public class A {
	static int z;
	int x;
	public A()
	{
	z=5;
	x=1;
	}
	public void print()
	{
	System.out.println("A: "+ z++);
	System.out.println("A: "+ ++x);
	}
}
