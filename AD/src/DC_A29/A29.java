package DC_A29;

public class A29 {
    public static void main(String[] args) {
        System.out.println(positivSummand(4, 2));
        System.out.println(positivSummand(3, 3));
        System.out.println(positivSummand(3, 4));
    }

    public static int positivSummand(int n, int k) {
        if (k > n || k == 0) return 0;
        if (k == n) return 1;

        return positivSummand(n-1, k-1) + positivSummand(n-k, k);
    }
}
