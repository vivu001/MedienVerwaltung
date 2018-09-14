package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("thu 2");
		al.add("thu 3");
		al.add("thu 4");
		
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {	
			System.out.println(((String) iterator.next()).toUpperCase());
		}

	}

}
