package VL06_A6;

public class Test {
    public static void main(String[] args) {
        Baum baum = new Baum();
        baum.einfuegen(18);
        baum.einfuegen(33);
        baum.einfuegen(10);
        baum.einfuegen(16);
        baum.einfuegen(14);
        baum.einfuegen(60);
        baum.einfuegen(40);
        baum.einfuegen(90);
        baum.einfuegen(50);
        baum.einfuegen(75);

        System.out.println(baum.traversierePreOrder(baum.getWurzel()));

        int[] a = {2, 90, 60, 11, 41, 35};
        System.out.print(baum.enthalten(baum.getWurzel(), a));
    }
}
