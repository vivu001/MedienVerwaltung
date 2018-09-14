package Exceptions;


public class AssertionTest {

	public static void main(String[] args) {
		int y = 4;
		try {
			assert (y>0 && y<5) :
				"Falscher Uebergabeparameter von berechne()";
			System.out.println(berechne(y)); 
			
		} catch (AssertionError e) {
			System.out.println(e.getMessage()+ "\n" + y);
			e.getStackTrace();
			System.exit(1);
		}
	}

	static int berechne(int x) {
		return x*x*x*x;
	}
}
