package Prk_02;

import java.io.OutputStream;
import java.io.PrintWriter;

public class Audio extends Medium {

    private static final long serialVersionUID = 1L;
    private String interpret;
    private int dauer;

    public Audio() {}
    
    public Audio(String titel, int jahr, String interpret, int dauer) {
        super(titel, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }
    
    public String getInterpret() {
        return this.interpret;
    }

    public int getDauer() {
        return this.dauer;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

//	public void druckeDaten() {
//		System.out.println("ID = " + super.getId() + " \"" + super.getTitel() + "\" von " 
//				+ getInterpret() + " aus " + super.getJahr() + " Spieldauer: " + getDauer() + " sek.");
//		// System.out.println("\"" + super.getTitel() + "\"" + " ist " + super.alter() + " Jahre alt");
//	}
    public void druckeDaten(OutputStream stream) {
        PrintWriter pw = new PrintWriter(stream);
        pw.printf(toString());
        pw.flush();
    }

    @Override
    public String toString() {
        return "ID = " + super.getId() + " \"" + super.getTitel() + "\" von "
                + getInterpret() + " aus " + super.getJahr() + " Spieldauer: " + getDauer() + " sek.%n";
    }
}
