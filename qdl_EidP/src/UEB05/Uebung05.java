package UEB05;

public class Uebung05 {

	public static void main(String[] args) {
		System.out.println("Aufgabe 1");
		printReverse10(12345);                    
		System.out.println("\n");
		
		System.out.println("Aufgabe 2");
		printReverse2(13);   
		System.out.println("\n");
		
		System.out.println("Aufgabe 3");
		System.out.println(reverse10(12345) + "\n");  
		
		System.out.println("Aufgabe 4");
		System.out.println(reverse2(13) + "\n");         
		
		System.out.println("Aufgabe 5");
		System.out.println(decToBin(13) + "\n");        
		
		System.out.println("Aufgabe 6");
		System.out.println(decToBinRev(13) + "\n");     
		
		System.out.println("Aufgabe 7");
		System.out.println(decToBinBasic(13));
	}

	//Aufgabe 1
	public static void printReverse10(int n) {
		while (n>0) {
			System.out.print(n%10);
			n/=10;
		}
	}
	
	//Aufgabe 2
	public static void printReverse2(int n) {
		while (n>0) {
			System.out.print(n%2);
			n/=2;
		}
	}
	
	//Aufgabe 3
	public static int reverse10(int n) {
		if (n==0) return 0;
		
		int result = 0;		
		while (n>0) {
			result = result * 10 + (n % 10);
			n /= 10;
		}
		return result;
		
//		if (n==0) return n;
//		return (int) ((n%10)*Math.pow(10, (int) Math.log10(n)) + reverse10(n/10));
	}
	
	//Aufgabe 4
	public static int reverse2(int n) {
		if (n==0) return 0;
		
		int result = 0;		
		while (n>0) {
			int r = n % 2;			
			result = result * 10 + r;
			n /= 2;
		}
		return result;
	}
	
	//Aufgabe 5
	public static int decToBin(int n) {
		int result = 0;
		int position = 1;	
		
		while (n>0) {
//			if (n%2 == 1) 
			result += (n%2)*position;
			position *= 10;
			n = n/2;
		}	
		return result;
	}
	
	//Aufgabe 6
	public static int decToBinRev(int n) {
		return reverse10(reverse2(n));
	}	
	
	//Aufgabe 7
	public static int decToBinBasic(int n) {
		int result = 0;
		int position = 1;	
		
		while (n>0) {
			if ((n&1) == 1) 
				result += (n%2)*position;
			position *= 10;
			n >>>= 1;          // ">>>" ist Vorzeichenloser Rechtsshift
		}	 
		return result;
	}
}
