package VL13_A3;

public abstract class Mitarbeiter {
	private String name;
	private int personalnummer;
        private static int anzahlMitarbeiter = 0;
        private Abteilung abt;
        
        public Mitarbeiter(String name, Abteilung abt) {
            this.name = name;
            this.abt = abt;
            personalnummer = ++anzahlMitarbeiter;
            abt.addMitarbeiter(this);
        }
        
        public abstract double berechneGehalt();
        
        public String getName() {
            return this.name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getPersonalnummer() {
            return this.personalnummer;
        }
        
        public Abteilung getAbteilung() {
            return abt;
        }
}
