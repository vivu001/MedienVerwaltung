package UEB09;

public interface Vector {

    public String toString();

    public int getDimension();

    public int get(int index);

    public void set(int index, int value);

    public double dist();

    public Vector add(Vector pos);

}
