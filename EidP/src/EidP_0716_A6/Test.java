package EidP_0716_A6;

public class Test {

	public static void main(String[] args) {
		Muster array = new Muster(5);
		Muster array2 = new Muster(5);
		
		array.fuelleArrayMitA();
		array.show();		
		
		System.out.println();
		
		array2.fuelleArrayMitBC();
		array2.show();
		
	}	
}
