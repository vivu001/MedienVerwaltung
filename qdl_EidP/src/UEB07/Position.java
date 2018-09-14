package UEB07;

public class Position {
	private double x, y, z;
	
	public Position() {
		x = y = z = 0;
	}
	
	public Position(double n) {
		x = y = z = n;
	}
	
	public Position (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// print
	public void print() {
		System.out.println("[" + x + ", " + y + ", " + z + "]");
	}
	
	// Entfernung berechnen
	public double dist() {
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	// addieren
	public Position add(Position p) {
		return new Position(p.x + x, p.y + y, p.z + z);
	}
	
	// dividieren
	public Position div(double teile) {
		return new Position(x/teile, y/teile, z/teile);
	}
}
