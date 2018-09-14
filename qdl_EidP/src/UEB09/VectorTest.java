package UEB09;

public class VectorTest {

    public static void main(String[] args) {
        Vector3 v3 = new Vector3(1, 2, 3);
        Vector v = new VectorN(3);
        Vector v2 = new VectorN(new int[] {1, 2});

        v.set(1, -7);
        v.set(2, 8);
        v.set(3, 9);

        System.out.println(v3);
        System.out.println(v);
        System.out.println(v2);
        System.out.println(v3.cross(v));
        System.out.println(v3.cross(v2));
    }
}
