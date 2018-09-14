package Exceptions;
import java.util.Random;
public class Teilen {

	public static void main(String[] args) {
		Random rd = new Random();
		int zaehler = rd.nextInt();
		int nenner = 0;
		
		String s = null;
		
//		System.out.println(zaehler/nenner);
		System.out.println(s.length());
		 try {
//			System.out.println(zaehler/nenner);
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.exit(1);
		} 
	}

}
