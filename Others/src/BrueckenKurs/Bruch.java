package BrueckenKurs;

public class Bruch {
	private int zaehler, nenner;
	
	public Bruch(int zaehler) {
		this.zaehler = zaehler;
		this.nenner = 1;
	}
	
	public Bruch(int zaehler, int nenner) throws ArithmeticException {
		this.zaehler = zaehler;
		this.nenner = nenner;
		if (nenner == 0) throw new ArithmeticException();
	}
	
	public int getZaehler() {
		return this.zaehler;
	}
	
	public int getNenner() {
		return this.nenner;
	}
	
	void multipliziere(int n) {
		this.zaehler *=n;
	}
	
	void multipliziere(Bruch b) {
		this.zaehler *= b.zaehler;
		this.nenner *= b.nenner;
	}
	
	void dividiere(Bruch b) throws ArithmeticException{
		if (b.zaehler ==0) throw new ArithmeticException();
		this.zaehler *= b.nenner;
		this.nenner *= b.zaehler;
		
	}
	
	public String toString() {
		return zaehler + "/" + nenner;
	}
	
	public int ggt(int a, int b) {
//		if (b==0) return a;
//		return ggt(b, a%b);
		
		do {
			if (a>b) {
				a -= b;
			}		
			if (b>a) {
				b -= a;
			}		
		} while (a!=b);
		return a;
	}
	
	public void kurze() {
//		if (zaehler !=0) { 
			int z = zaehler; //		int n = nenner;
			this.zaehler /= ggt(z, nenner);
			this.nenner /= ggt(z, nenner);
//		} else zaehler =0;
		
	}
	
	public static void main(String[] args) {
		try { 
			Bruch a = new Bruch(3);
			Bruch b = new Bruch(1, 3);
			Bruch c = new Bruch(0, 6);
	//		b.multipliziere(2);
//			b.multipliziere(c);
			
			b.dividiere(c);
	//		System.out.println(a.toString());
			System.out.println(b.toString());
			System.out.println(b.ggt(b.getZaehler(), b.getNenner()));
			b.kurze();
			System.out.println(b.toString());
		} catch (ArithmeticException e) {

			System.out.println("Geben Sie einen Nenner <> 0 an");
		}
	}
}
