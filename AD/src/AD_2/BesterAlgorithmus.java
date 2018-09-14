package AD_2;
public class BesterAlgorithmus
{
	public static long starttime;
	public static long finishtime;
	// 1000n
	public static double g1(int n)
	{
		return 1000*n;
	}

	// 100n * log2(n+1)
	public static double g2(int n)
	{
		return (100*n*Math.log10(n+1)/Math.log10(2));
	}

	// 10 * n * n
	public static double g3(int n)
	{
		return 10*n*n;
	}

	// n * n * n
	public static double g4(int n)
	{
		return n*n*n;
	}

	// 2 hoch n
	public static double g5(int n)
	{
		if (n>0) return 2*g5(n-1);
		else return 1;
	}

	// n!
	public static double g6(int n)
	{
		if (n>1) return n*g6(n-1);
		else return 1;
	}

	// Bestimmt fuer alle 6 Funktionen den Wert von
	// gi(n) und gibt den Index der Funktion mit
	// dem minimalen Wert zurueck
	public static int gewinnerFuerN(int n)	{
		assert (n>0 && n<=2000);
		
		double[] feld = {g1(n), g2(n), g3(n), g4(n), g5(n), g6(n)};
		double min=feld[0];
		int minIndex=0;
		for (int i=1; i<feld.length; i++) {
			if (feld[i]<min) {
				min=feld[i];
				minIndex=i;
			}
		}
		return minIndex;
	}

	// Gibt f?r jede Zahl n zwischen 1 und 2000 aus, welcher der
	// 6 Algorithmen (A1 .. A6) f?r das betrachtete n der Beste ist
	public static void main(String[] args)
	{
		System.out.println(gewinnerFuerN(2984));
//		System.out.println(g5(10));
	}
}