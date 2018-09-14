package UEB09;

public class VectorN implements Vector {

    int[] value;

    public VectorN() {
    }

    public VectorN(int demension) {
        value = new int[demension];

        for (int i = 0; i < demension; i++) {
            value[i] = 0;
        }
    }

    public VectorN(int[] values) {
        value = new int[values.length];
        System.arraycopy(values, 0, value, 0, value.length);
    }

    @Override
    public int getDimension() {
        return value.length;
    }

    @Override
    public int get(int index) {
        if (index > 0 && index <= value.length) {
            return value[index - 1];
        } else {
            return 0;
        }
    }

    @Override
    public void set(int index, int wert) {
        if ((index > 0) && (index <= value.length)) {
            value[index - 1] = wert;
        }
    }

    @Override
    public double dist() {
        int s = 0;

        for (int i = 0; i < value.length; i++) {
            s += value[i] * value[i];
        }

        return Math.sqrt(s);
    }

    @Override
    public Vector add(Vector pos) {
        VectorN newPos = null;

        if (pos.getDimension() == value.length) {
            int[] newArray = new int[value.length];

            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = value[i] + pos.get(i + 1);
            }
            newPos = new VectorN(newArray);

            return newPos;
        }

        return newPos;
    }

    @Override
    public String toString() {
        String str = "[";

        for (int i = 0; i < value.length; i++) {
            if (i < value.length - 1) {
                str += value[i] + ", ";
            } else {
                str += value[i] + "]";
            }
        }
        return str;
    }
}
