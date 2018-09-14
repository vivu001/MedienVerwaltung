package EidP_0717_A8;

public class B extends A{
	public int a;
	
	public B() {
		a += 10;
	}
	
	public void methode(int a) {
		s *= a;
	}
	
	public void ausgabe() {
		System.out.println("a = " + this.a);
		System.out.println("s = " + s);
	}
}
