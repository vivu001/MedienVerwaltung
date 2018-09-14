package Prk_022;

import java.util.ArrayList;
import java.util.Iterator;

public class Medienverwaltung {
	ArrayList medienArrayList = new ArrayList();
	Iterator it = medienArrayList.iterator();
	
	public void aufnehmen(Medium medium) {
		medienArrayList.add(medium);
	}
	
	public void zeigeMedien() {
		if (it.hasNext()) {
			for (Object s : medienArrayList) {
				((Medium) s).druckeDaten();	
			} 	
		}
	}
	
	public void sucheNeuesMedium() {
		if (it.hasNext()) {
			int neuesJahr = ((Medium) medienArrayList.get(0)).getJahr();
			int index = 0;
			for (int i=1; i<medienArrayList.size(); i++)
				if (neuesJahr < ((Medium) medienArrayList.get(i)).getJahr()) {
					neuesJahr = ((Medium) medienArrayList.get(i)).getJahr();
					index = i;
				}	
			((Medium) medienArrayList.get(index)).druckeDaten();
			System.out.println(neuesJahr);
		}
	}
	
	public double berechneErscheinungsjahr() {	
		if (medienArrayList.size()>0) {
			double s = 0.0;
			for (int i = 0; i < medienArrayList.size(); i++) {
				s += ((Medium) medienArrayList.get(i)).getJahr();
			}
			return s/medienArrayList.size();
		}
		else return 0.0; 
	}
}
