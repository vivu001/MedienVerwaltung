package Rekursion;

public class Hanoi_Turm {
	
	public static void main(String[] args) {
		try {
			hanoi(0, 'A', 'C', 'B');
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}	
	
	
	public static void write(char a, char b) {
		System.out.print('(');
		System.out.print(a);
		System.out.print(',');
		System.out.print(b);
		System.out.print(") ");
	}
	
	//chuyen n dia tu A sang C
	public static void hanoi(int n, char a, char c, char b) throws AssertionError {
		if (n<1) throw new AssertionError();
		else if (n==1) {
				write(a,c);
				} else {
					hanoi(n-1,a,b,c); //chuyen n-1 dia tu A sang B
					write(a,c);
					hanoi(n-1,b,c,a); //chuyen n-1 dia tu B sang C	
		}
	}
}

