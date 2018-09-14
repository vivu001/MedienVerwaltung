package EidP_0215_A8;

public class B extends A{
	public int x;
	
	public B()
	{
		x *= 2;
	}
	
	public void methode(int x)
	{
		y *= x;
	}
	
	public void ausgabe()
	{
		System.out.println("x = " + this.x);
		System.out.println("y = " + y);
		super.ausgabe();
	}
}
