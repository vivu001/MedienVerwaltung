package PK_1;
import java.time.LocalDate;

public abstract class Medium {
	private static int  id = -1;
	private String titel;
	private int jahr;
	
	public Medium(String titel, int jahr) {
		this.titel = titel;
		this.jahr = jahr;
		id++;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public int getId() {
		return id;
	}
	
	public int alter() {
		return LocalDate.now().getYear() - jahr;
	}
	
	public abstract void druckeDaten();
}
