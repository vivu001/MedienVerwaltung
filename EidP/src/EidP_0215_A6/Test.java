package EidP_0215_A6;

public class Test {

	public static void main(String[] args) {
		Spiegel spiegel = new Spiegel(6);
		
		spiegel.fuelleFeld('o', 'u');
		spiegel.display(spiegel.feld); // print
		System.out.println();
		
//		spiegel.fuelleOberesDreieck('A');
//		spiegel.display(spiegel.feld);
//		System.out.println();
		
		spiegel.spiegele('A');
		spiegel.display(spiegel.feld);

	}

}
