package EidP_0218_A7;

public class B extends A {
    private int m;
    public B(int m, int n)
    {
        super(n);
        this.m = m + 1;
    }

    public void erhoehe(int i)
    {
        m += i;
        super.erhoehe(i);
        System.out.println(m);
    }
}
