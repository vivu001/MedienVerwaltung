package EidP_0716_A7;

public class Test {

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
                
		int i = 1;
		a.test(5000);
                
		System.out.println(a.i);
		System.out.println(a);              
                
		for (i=0; i<5; i++) {
		System.out.print(i++ % 2 + " ");
		}
		
	}

}
