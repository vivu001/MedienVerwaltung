/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe_6;

/**
 *
 * @author Vu Viet Duc
 */
public class Sender {
    private String bezeichung;
    private String genre;
    
    public Sender(String bezeichnung, String genre) {
        this.bezeichung = bezeichnung;
        this.genre = genre;
    }
    
    public String getBezeichnung() {
        return bezeichung;
    }
    
    public String getGenre() {
        return genre;
    }
}
