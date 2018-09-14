package VL03_A2;

public class Test_2 {

	public static void main(String[] args) {
		Link link3 = new Link(5, null);
		Link link2 = new Link(4, link3);
		Link link1 = new Link(3, link2);
		
		Liste list1 = new Liste();
		list1.anfang = link1;
		System.out.print("List 1: ");
		list1.display();
		System.out.println();
		
		Link link5 = new Link(7, null);
		Link link4 = new Link(1, link5);

		Liste list2 = new Liste();
		list2.anfang = link4;
		System.out.print("List 2: ");
		list2.display();
		System.out.println();
				
		list1.verketten(list2);
		System.out.print("Verkettete List: ");
		list1.display();
		System.out.println();
		
		list1.rueckwaertsAusgeben();
	}

}
