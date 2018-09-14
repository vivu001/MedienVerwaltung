package EidP_0714_A6;

public class Matrix {
	int[][] data;

	public Matrix(int n) {
		data = new int[n][n];
	}
	
	public void fuelleMatrix() {
		int pos = 0;
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[i].length; j++) 
				data[i][j] = pos++;
				
			pos -= data.length + 1;
		}
	}

	public String toString() {
		String result = "";

		for (int i=0; i<data.length; i++)
			for (int j=0; j<data[i].length; j++)
				if (j == data[i].length-1) 
					System.out.printf("%3d \n", data[i][j]);
				else System.out.printf("%3d", data[i][j]);
			
		return result;
	}	
}
