package EidP_0217_A7;

public class A {
    private static int c = 1;
    private int m;
    private int n;
    public A(int m, int n)
    {
        this.m = m;
        this.n = n;
        c++;
    }
    public void erhoehe(int i)
    {
        m += i;
        c = c + m * n;
        System.out.println(m);
        System.out.println(n);
        System.out.println(c);
        // Zeitpunkt 1
    }
}
