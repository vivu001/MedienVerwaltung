package UEB01;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
	
	//11	
	int test = new Scanner(System.in).nextInt();
//	System.out.println(MatrNum(test));
	
	//13
//	teilen(test);
	
	//14
//	System.out.printf(erhoehe(test) + " ");
	
	//15+16
	System.out.println(sum3(test));
	}
	
	public static int MatrNum(int n) {
		switch (n) {
		case -1 : return -1;
		case -2 : return -1;
		case -3 : return -1;
		case 7104370 : return 7104370;
		default : return n*n;
		}
	}
	public static void teilen(int n) {
		while (n>=0) {
			if (n==0) {
				System.out.print(n);
				break;
			}
			System.out.printf(n + " ");
			n/=2;
		}
	}
	public static int erhoehe(int z) {
		if (z>0) {
			int zaehler=0;
			while (z>0) {
				zaehler+=1;
				z+=1;
			}
			return z;
		} else return -1;
	}
	public static int sum1(int z) {
		if (z>=0) {
			int s=0;
			for(int i=1; i<=z; i++) {
				s+=i;
			}
			return s;
		} else return 0;
	}

	public static int sum2(int z) {
		if (z>=0) {
			int s=0;
			int i=1;
			while (i<=z) {
				s+=i;
				i++;
			}
			return s;
		} else return 0;
	}
	
	public static int sum3(int z) {
		if (z>=0) {
			int s=0;
			int i=1;
			do {
				s+=i;
				i++;
			} while (i<=z);
			return s;
		} else return 0;
	}
}
