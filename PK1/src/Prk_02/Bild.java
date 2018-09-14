package Prk_02;

import java.io.OutputStream;
import java.io.PrintWriter;

public class Bild extends Medium {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String ort;

    public Bild() {
    }
    
    public Bild(String titel, int jahr, String ort) {
        super(titel, jahr);
        this.ort = ort;
    }

  

    public String getOrt() {
        return this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

//	public void druckeDaten() {
//		System.out.println("ID = " + super.getId() + " \"" + getTitel() +
//							 "\" aufgenommen im Jahr " + super.getJahr() + " in " + getOrt());
//		//System.out.println("\"" + super.getTitel() + "\"" + " ist " + super.alter() + " Jahre alt");
//	}
    public void druckeDaten(OutputStream stream) {
        PrintWriter pw = new PrintWriter(stream);
//        pw.printf("ID = " + super.getId() + " \"" + getTitel()
//                + "\" aufgenommen im Jahr " + super.getJahr() + " in " + getOrt() + "%n");
        pw.printf(toString());
        pw.flush();
    }

    @Override
    public String toString() {
        return "ID = " + super.getId() + " \"" + getTitel()
                + "\" aufgenommen im Jahr " + super.getJahr() + " in " + getOrt() + "%n";
    }
}
