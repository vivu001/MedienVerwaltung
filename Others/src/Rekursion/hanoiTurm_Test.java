package Rekursion;

public class hanoiTurm_Test {

	public static void main(String[] args) {
		try {
			int k=0;
			assert (k>0) : "Nhap k>0" ;
				hanoi(k, 'A', 'C', 'B');
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
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
	public static void hanoi(int n, char a, char c, char b) {
		if (n==1) {
			write(a,c);
		} else {
			hanoi(n-1,a,b,c); //chuyen n-1 dia tu A sang B
			write(a,c);
			hanoi(n-1,b,c,a); //chuyen n-1 dia tu B sang C	
		}
	}
}
