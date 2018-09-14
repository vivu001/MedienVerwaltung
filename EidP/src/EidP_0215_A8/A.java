package EidP_0215_A8;

public class A {
	public int x = 5;
	public static int y = 10;
	
	public A()
	{
		x = ++x + y;
		y++;
	}
	
	public void methode(int x)
	{
		x++;
		y = x;
	}
	
	public void ausgabe()
	{
		System.out.println("x = " + this.x);
		System.out.println("y = " + y);
		System.out.println();
	}
}
