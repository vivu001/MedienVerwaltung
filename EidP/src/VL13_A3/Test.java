/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL13_A3;

/**
 *
 * @author Vu Viet Duc
 */
public class Test {

    public static void main(String[] args) {
        Abteilung abt1 = new Abteilung("Entwicklung");
        Abteilung abt2 = new Abteilung("Vertrieb");

        Angestellter ang1 = new Angestellter("Marc", 3000.0, 175.0, 50.0, abt1);
        Angestellter ang2 = new Angestellter("Paul", 2500.0, 150.0, 50.0, abt2);
        Angestellter ang3 = new Angestellter("Karin", 2700.0, 160.0, 50.0, abt1);

        Manager mg1 = new Manager("Sven", 4000.0, 0.01, abt2);
        mg1.setUmsatz(10000.0);
        Manager mg2 = new Manager("Susanne", 5000.0, 0.03, abt2);
        mg2.setUmsatz(20000.0);

        System.out.println(ang1.getName() + " " + ang1.berechneGehalt() + " "
                + ang1.getAbteilung().getBezeichnung());
        System.out.println(ang2.getName() + " " + ang2.berechneGehalt() + " "
                + ang2.getAbteilung().getBezeichnung());
        System.out.println(ang3.getName() + " " + ang3.berechneGehalt() + " "
                + ang3.getAbteilung().getBezeichnung());
        System.out.println(mg1.getName() + " " + mg1.berechneGehalt() + " "
                + mg1.getAbteilung().getBezeichnung());
        System.out.println(mg2.getName() + " " + mg2.berechneGehalt() + " "
                + mg2.getAbteilung().getBezeichnung());
        
        System.out.println("\nGehaltskosten:");
        System.out.println("Abteilung " + abt1.getBezeichnung() + " "
                + abt1.berechneGehaltskosten());
        System.out.println("Abteilung " + abt2.getBezeichnung() + " "
                + abt2.berechneGehaltskosten());
    }

}
