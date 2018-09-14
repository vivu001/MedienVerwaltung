package VL03_A1;

public class Test {

	public static void main(String[] args) {
		Liste list = new Liste();
		
		list.einfuegenAnfang(4);
		list.einfuegenAnfang(3);
		list.einfuegenAnfang(2);
		list.einfuegenAnfang(1);
		
		System.out.println(list.istLeer());
		System.out.println(list.zaehleElemente(4));
		
		list.spiegeln();
		
		list.ausgeben();
		
	}

}
