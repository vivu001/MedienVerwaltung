package UEB08;

public class PositionN implements Position{
	int[] array;
	
	public PositionN(int n) {
		array = new int[n];
		
		for (int i=0; i < n; i++)
			array[i] = 0;
	}
	
	public PositionN(int[] feld) {
		array = new int[feld.length];
		
		for (int i=0; i < array.length; i++) 
			array[i] = feld[i];
	}
	
	@Override
	public String toString() {
		String str = "[";
		
		for (int i=0; i < array.length; i++) 
			if (i < array.length-1) 
				str += array[i] +", ";
			else str += array[i] + "]";
		return str;
	}
	
	@Override
	public int getDimension() {
		return array.length;
	}

	@Override
	public int get(int index) {
		if (index > 0 && index <= array.length)
			return array[index-1];
		else return 0;
	}

	@Override
	public void set(int index, int wert) {
		if ((index > 0) && (index <= array.length)) {
			array[index-1] = wert; 
		}		
	}

	@Override
	public double dist() {
		int s = 0;
		
		for (int i=0; i < array.length; i++)
			s += array[i] * array[i];
		
		return Math.sqrt(s);
	}

	@Override
	public Position add(Position pos) {
		PositionN newPos = null;
                
		if (pos.getDimension() == array.length) {		
			int[] newArray = new int[array.length];
			
			for (int i=0; i < newArray.length; i++) {
				newArray[i] = array[i] + pos.get(i+1);			
			}
            
			newPos = new PositionN(newArray);
			return newPos;		
		}
		
		return newPos;
	}	
}
