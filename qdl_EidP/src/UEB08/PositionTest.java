package UEB08;

public class PositionTest {

	public static void main(String[] args) {
		Position p2_a = new Position2( 1, 2 );
		Position p2_b = new PositionN( 2 );
//		int[] feld = {2,3,4};
//		Position p2_d = new PositionN( feld ) ;
		
		System.out.println(p2_a);
		System.out.println(p2_b);
//		System.out.println(p2_d);
		
		// change value of p2_b
		p2_b.set( 1, 3 );
		p2_b.set( 2, 7 );
		
		Position p2_c = p2_a.add( p2_b );	
		
		System.out.println( p2_c );
                System.out.println( p2_b.add( p2_a ) );
		
	}

}
