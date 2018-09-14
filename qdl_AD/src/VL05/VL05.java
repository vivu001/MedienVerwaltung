package VL05;

public class VL05 {
    public static void main(String[] args) {
//        System.out.println(sum_of_squares(5));
//
//        int[] a = {4, 7, 9, -2, 1, 3, 5};
//        System.out.println(max(a, 2));

     /*   System.out.println(calc(0)); // = 1
        System.out.println(calc(1)); // = 3
        System.out.println(calc(2)); // = 7
        System.out.println(calc(3)); // = 15
    */
//        System.out.println(f(4,13));
        System.out.println(func_s(7, 2));
        System.out.println(func_s(5, 4));
        System.out.println(iterativ_func_s(7,2));

    }

    //Aufgabe 1_a
    public static int sum_of_squares(int n) {
        if (n == 1) return 1;

        return n*n + sum_of_squares(n-1);
    }

    //Aufgabe 1_b
    public static int max(int[] a, int n) {
        assert (n > 0);
        if (n == 1) return a[0];

        return Math.max(a[n-1], max(a, n-1));
    }

    //Aufgabe 2
    public static long calc(int n) {
        if ( n <= 0 ) return 1;
        else return 1 + 2*calc( n - 1 );
    }

    //Aufgabe 3
    public static int f(int x, int y) {
        if ( y <= 1 ) return 1;
        else if ( x == 0 ) return 2;
        else return f( x-2, y/2 ) - 2*f( x-2, y );
    }

    //Aufgabe 4
    public static int func_p( int n ) {
        if (n == 0) return 0;
        else return n - 1;
    }

    public static int func_s( int m, int n ) {
        if ( n == 0 ) return m;
        else return func_p( func_s( m, n - 1 ) );
    }

    public static int iterativ_func_s(int m, int n) {
        while (n > 0 ) {
            m--;
            n--;
        }
        return m;
    }
}
