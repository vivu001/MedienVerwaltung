package Fachlogik;

import java.io.OutputStream;
import java.io.Serializable;

public abstract class Medium implements Comparable<Medium>, Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private static int counter = -1;
	private String titel;
	private int jahr;
	
        public Medium() {
            this("", 0);
           
        }
        
	public Medium(String titel, int jahr) {
		this.titel = titel;
		this.jahr = jahr;
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
	
	public void setJahr(int year) {
		jahr = year;
	}
	
        public void setTitel(String neuerTitel) {
            this.titel = neuerTitel;
        }
        
	public String getTitel() {
		return titel;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public int alter() {
		return java.time.LocalDate.now().getYear()-jahr;
	}
	
//	public abstract void druckeDaten();
	
	public abstract void druckeDaten(OutputStream stream);

	@Override
	public int compareTo(Medium med) {
		if (jahr == med.getJahr()) return 0;
		else if (jahr > med.getJahr()) return 1;
		else return -1;
	}
}
