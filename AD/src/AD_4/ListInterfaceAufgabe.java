package AD_4;
import java.util.*;

public class ListInterfaceAufgabe
{
	// Elemente in Liste einfügen
	static void fillList(List<String> list)
	{
		// Zahlen von 0 bis 20 als Zeichenketten (Strings) einfügen
		for (int a = 0; a <= 20; a++)
			list.add("" + a);

		// Element an der Position 3 entfernen
		list.remove(3);

		// Erstes Element in der Liste entfernen, das gleich "6" ist
		list.remove("6");
	}

	// Liste vom Anfang bis zum Ende mit einer
	// foreach-Schleife iterieren und Elemente ausgeben
	static void printList(List<String> list)
	{
		for (String s : list)
			System.out.print(s + " ");
		System.out.println();
	}

	// Alle Elemente aus der Liste entfernen, die durch 5 teilbar sind
	static void remove5List(List<String> list)
	{
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			if (Integer.parseInt(it.next())%5==0) it.remove();
		}
	}

	public static void main(String[] args)
	{
		// Erzeugen der LinkedList
		LinkedList<String> list1 = new LinkedList<String>();
		fillList(list1);
		System.out.println("\nAusgabe der ersten Liste(list1)");
		printList(list1);

		remove5List(list1);
		System.out.println("\nlist1 nach dem Entfernen der durch 5 teilbaren Zahlen");
		printList(list1);

		// Erzeugen der ArrayList
		ArrayList<String> list2 = new ArrayList<String>();
		fillList(list2);

		System.out.println("\nAusgabe der zweiten Liste(list2)");
		printList(list2);

		List<String> teilliste = list2.subList(list2.indexOf("7"), list2.indexOf("13"));
		printList(teilliste);
		teilliste.remove("11");
		printList(teilliste);
		printList(list2);
	}
}