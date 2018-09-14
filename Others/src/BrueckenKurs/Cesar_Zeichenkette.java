package BrueckenKurs;

public class Cesar_Zeichenkette {

	public static void main(String[] args) {
//		System.out.print(Umwandlung("Ltg lxgs Stjihrwtg Ujhhqpaa-Btxhitg?"));
		char a = 103;
		char b = 'h';
		System.out.println((char)(a+3)); //106
		System.out.println(b); //h
	
	}
	
	public static String Umwandlung(String s) {
		String s1= "";
//		char c;
		for (int i=0; i< s.length(); i++) {
			if (s.charAt(i) != 32) {
					s1 += (char) (s.charAt(i)-3);
			} else s1 += (char) (s.charAt(i));
//			s1+=c;
		}
		return s1;
	}

}
