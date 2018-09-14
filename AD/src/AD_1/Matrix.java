package AD_1;
public class Matrix
{
	private int[][] data;

	// Standard-Konstruktor; erzeugt keine Matrix
	public Matrix()
	{
	}

	// Konstruktor; erzeugt eine leere Matrix
	public Matrix(int anzZeilen, int anzSpalten)
	{
		assert(anzZeilen > 0);
		assert(anzSpalten > 0);

		data = new int[anzZeilen][anzSpalten];
	}

	// Konstruktor; kopiert die Werte eines existierenden Arrays
	public Matrix(final int[][] data)
	{
		assert(data!=null);

		int anzZeilen = data.length;
		int anzSpalten = data[0].length;

		this.data = new int[data.length][data[0].length];

		for (int a = 0; a < anzZeilen; a++)
			for (int b = 0; b < anzSpalten; b++)
				this.data[a][b] = data[a][b];
	}

	// Bindet das Matrix-Objekt an ein existierendes Array
	public void attach(int[][] data)
	{
		assert(data!=null);

		this.data = data;
	}

	// L?scht die Bindung zum Array
	public int[][] detach()
	{
		assert(data!=null);

		int[][] victim = data;
		data = null;

		return victim;
	}

/** A.transpose():
 *
 *  A entspricht Matrix, die transponiert werden soll. (Die
 *  zugeh?rigen Zahlen werden im Attribut 'data' gespeichert)
 *
 *  anzSpalten <- dim(A,1)  // Anzahl Spalten in transp. Matrix
 *  anzZeilen <- dim(A,2)   // Anzahl Zeilen in transp. Matrix
 *
 *  B = create Matrix(anzZeilen, anzSpalten)
 *
 *  for a <- 1 to anzSpalten do
 *    for b <- 1 to anzZeilen do
 *      B[b,a] <- A[a,b]
 *    end for
 *  end for
 *
 *  return B
 */

	public Matrix transpose()
	{
		assert(data!=null);
		
		int[][] b = new int[data[0].length][data.length];
		for (int i=0; i< data.length; i++) 
			for (int j=0; j<data[i].length; j++) {
				b[j][i] = data[i][j];
			}
	return new Matrix(b);
	}

	public void print(final String text)
	{
		assert(data!=null);

		int anzZeilen = data.length;
		int anzSpalten = data[0].length;

		System.out.println(text);

		for (int a = 0; a < anzZeilen; a++)
		{
			for (int b = 0; b < anzSpalten; b++)
				System.out.print((data[a][b] >= 0 ? "\t " : "\t") + data[a][b]);

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int[][] data = { { 1, 8, -3 }, { 4, -2, 5 } };

		// Matrix:
		// 1  8 -3
		// 4 -2  5
		Matrix A = new Matrix(data);
		A.print("Matrix A");

		Matrix B = A.transpose();
		B.print("Matrix B");
	}
}
