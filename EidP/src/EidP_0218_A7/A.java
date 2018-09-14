package EidP_0218_A7;

public class A {
    private static int c = 1;
    private int m;
    private int n;
    public A(int n)
    {
        m = 5;
        c += m+n;
    }
    public void methode(int i)
    {
        m -= i;
        erhoehe(i);
     // Zeitpunkt 1
        System.out.println(m);
    }
    public void erhoehe(int i)
    {
        m += 2*i;
    }
}
