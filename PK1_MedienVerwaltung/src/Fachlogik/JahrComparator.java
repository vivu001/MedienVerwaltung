package Fachlogik;

import java.util.Comparator;

class JahrComparator implements Comparator<Medium>{
	public int compare(Medium m1, Medium m2) {
		if (m1.getJahr() == m2.getJahr()) return 0;
		else if (m1.getJahr() > m2.getJahr()) return 1;
		else return -1;			
	}
}
