package EidP_0217_A8;

public class Test {

	public static void main(String[] args) {
		A einA = new A();
		einA.print();
		
		A einB = new B();
		einB.print();
		System.out.println("B: " + einB.x);
		
		C einC = new C();
		einC.print();
		System.out.println("C: " + einC.x);

	}

}
