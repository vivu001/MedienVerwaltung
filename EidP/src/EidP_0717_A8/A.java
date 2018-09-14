package EidP_0717_A8;

public class A {
		public int a = 10;
		public static int s = 10;
		
		public A() {
			a = a - --s;
			s++;
		}
		
		public void methode(int a) {
			s = a + this.a;
		}
		
		public void ausgabe() {
			System.out.println("a = " + this.a);
			System.out.println("s = " + s);
			System.out.println();
		}
}
