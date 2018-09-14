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
public class InternetRadio extends Geraet implements IPGeraet {
    private String ipAdresse;
    private int anz = 0;
    Sender[] favoriten;
    
    public InternetRadio(int id, String hersteller) {
        super(id, hersteller);
        favoriten = new Sender[100];
       
    }
    
    public int getAnzahlFavoriten() {
        return anz;
    }

    public int addFavorit(String bezeichnung, String genre) {
        
        if (anz < 100) {
            Sender neuerSender = new Sender(bezeichnung, genre);
            favoriten[anz] = neuerSender;
            return anz++;
        } 
        else return -1;
    }
    
    public boolean removeFavorit() {
        
        if (anz > 0) {
            favoriten[0] = favoriten[--anz];
            favoriten[anz] = null;
            return true;
        }
        
        return false;
    }
    
    public Sender getFavorit(int index) {
        if (index >= 0 && index < anz)
            return favoriten[index];
        else return null;
    }
    
    public void ausgebenFavoriten() {
        for (int i=0; i < getAnzahlFavoriten(); i++) {
            System.out.println("Bezeichung: " + favoriten[i].getBezeichnung() + " Genre: " + favoriten[i].getGenre());
        }       
    }
    
    @Override
    public String getIPAddresse() {
      return ipAdresse;
    }
}
