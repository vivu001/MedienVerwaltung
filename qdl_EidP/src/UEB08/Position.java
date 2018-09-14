package UEB08;

public interface Position {

	public String toString();
	
	public int getDimension();
	
	public int get(int index);
	
	public void set(int index, int wert);
	
	public double dist();
	
	public Position add(Position pos);
}
