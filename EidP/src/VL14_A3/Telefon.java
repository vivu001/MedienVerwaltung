/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL14_A3;

/**
 *
 * @author Vu Viet Duc
 */
public class Telefon {
	private int id;
	private String rufnummer;
	
	public Telefon(int id, String rufnummer) {
		this.id = id;
		this.rufnummer = rufnummer;
	}
	public int getId() {
		return this.id;
	}
	public String getRufnummer() {
		return this.rufnummer;
	}
	public String toString() {
		return "ID: " + this.id + " Rufnummer: " + this.rufnummer;
	}
}

