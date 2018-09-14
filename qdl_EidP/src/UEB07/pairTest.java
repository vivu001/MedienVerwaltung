package UEB07;

public class pairTest {

	public static void main(String[] args) {
//		Pair p1 = new Pair();
//		Pair p2 = new Pair(5);
//		Pair p3 = new Pair(6, 7);
//		
//		p1.print();
//		p2.print();
//		p3.print();
		
		Position pos1 = new Position();
		Position pos2 = new Position(3.0);
		Position pos3 = new Position(6.0, 8.0, 10.0);
		
		pos1.print();
		pos2.print();
		pos3.print();
		
		pos3.add(pos2).print();
		pos3.print();
		System.out.println(pos3.dist());
		pos3.div(2.0).print();
		
	}

}
