package EidP_0217_A8;

public class C extends B{
	int x;
	public void print()
	{
	System.out.println("C: "+ ++z);
	System.out.println("C: "+ ++super.x);
	super.print();
	}
}
