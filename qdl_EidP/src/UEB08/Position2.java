package UEB08;

public class Position2 implements Position{
	private int x, y;
	
	public Position2() {
		this.x = this.y = 0;
	}
	
	public Position2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	@Override
	public int getDimension() {
		return 2;
	}

	@Override
	public int get(int index) {
		int wahl = 0;
		
		switch (index) {
			case 1: wahl = this.x; break;
			case 2: wahl = this.y; break;
			default: return 0;
		}
		return wahl;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	@Override
	public void set(int index, int wert) {
		switch (index) {
			case 1: x = wert; break;
			case 2: y = wert; break;
		}		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public double dist() {
		return Math.sqrt(x*x + y*y);
	}

	@Override
	public Position add(Position pos) {
		Position2 newPos = null;
		
		if (pos.getDimension() == 2) {             
			newPos = new Position2(pos.get(1) + x, pos.get(2) + y);                              		
		}
		
		return newPos;	
	}
}

