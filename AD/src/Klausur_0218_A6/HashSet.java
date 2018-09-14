package Klausur_0218_A6;

public class HashSet {
    public Eintrag[] set;

    public HashSet(int n) {
        assert n>3;
        set = new Eintrag[n];
    }

    public boolean insert_Duc(int d) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != null)
                if (set[i].data == d) return false;
        }

        int pos = d % set.length;
        int count = 0;
        while (set[pos] != null) {
            if (count == set.length) return false;
            count++;
            pos = (pos + 5) % set.length;
        }

        set[pos] = new Eintrag(d);
        return true;
    }

    public boolean insert_Alex(int d) {
        int i = 1;

        boolean gefunden = false;
        if (set[d % set.length].data == 0) {
            set[d % set.length].data = d;
            return true;
        } else {
            while (!gefunden) {
                int c = (d % set.length + 5 * i) % set.length;
                if (set[c].data == 0) {
                    set[c].data = d;
                    return true;
                }
                gefunden = false;
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet test = new HashSet(7);

        System.out.println(test.insert_Duc(3));
        System.out.println(test.insert_Duc(9));
        System.out.println(test.insert_Duc(5));
        System.out.println(test.insert_Duc(16));
        System.out.println(test.insert_Duc(23));
        System.out.println(test.insert_Duc(7));
        System.out.println(test.insert_Duc(9));

//        test.insert_Duc(9);
//        test.insert_Duc(5);
//        test.insert_Duc(16);
//        test.insert_Duc(23);
//        test.insert_Duc(7);
//        test.insert_Duc(9);

/*        test.insert_Alex(3);
        test.insert_Alex(9);
        test.insert_Alex(5);
        test.insert_Alex(16);
        test.insert_Alex(23);
        test.insert_Alex(7);
        test.insert_Alex(9); */

        for (int i = 0; i < test.set.length; i++) {
            if (test.set[i] != null)
                System.out.print(test.set[i].data + "  ");
            else System.out.print("X" + "  ");
        }
    }
}
