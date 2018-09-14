package EidP_0714_A5;

public class Aufgabe_5 {

	public static void main(String[] args) {
		char[] c = {'e', 'a', 's'};
		int[] test = zaehleZeichen("Dies ist ein Test", c);
		
		for (int i=0; i<test.length; i++) {
			if (i==0) 
				System.out.print("{" + test[i] + ", ");
			else if (i==test.length-1) 
					System.out.print(test[i] + "}");
				else System.out.print(test[i] + ", ");
		}
	}

	public static int[] zaehleZeichen(String str, char[] c) {
		int[] count = new int[c.length];
		
		for (int i=0; i<c.length; i++) 
			for (int j=0; j<str.length(); j++) 
				if (str.charAt(j) == c[i])
					count[i]++;
		return count;
	}
}
