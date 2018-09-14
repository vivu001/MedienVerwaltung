package Prk_01;

public abstract class Medium {
	private int id;
	private static int counter=-1;
	private String titel;
	private int jahr;
	
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
	
	public String getTitel() {
		return titel;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public int alter() {
		return java.time.LocalDate.now().getYear()-jahr;
	}
	
	public abstract void druckeDaten();
}
