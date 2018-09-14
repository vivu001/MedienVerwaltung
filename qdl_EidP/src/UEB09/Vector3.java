package UEB09;

public class Vector3 extends VectorN {

    public Vector3() {
        super(3);
    }

    public Vector3(int[] values) {
        super(values);
    }

    public Vector3(int x, int y, int z) {
        super();
        value = new int[3];
        value[0] = x;
        value[1] = y;
        value[2] = z;
    }

//    @Override
//    public String toString() {
//        String str = "[";
//
//        for (int i = 0; i < value.length; i++) {
//            if (i < value.length - 1) {
//                str += value[i] + ", ";
//            } else {
//                str += value[i] + "]";
//            }
//        }
//        return str;
//    }

    public Vector cross(Vector vec) {
        if (vec.getDimension() == 3) {
            Vector result = new Vector3();

            result.set(1, super.get(2) * vec.get(3) - super.get(3) * vec.get(2));
            result.set(2, super.get(1) * vec.get(2) - super.get(2) * vec.get(1));
            result.set(3, super.get(3) * vec.get(1) - super.get(1) * vec.get(3));

            return result;
        } else {
            return null;
        }
    }
}
