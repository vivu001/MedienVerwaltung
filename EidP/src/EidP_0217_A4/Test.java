package EidP_0217_A4;

public class Test {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone(1, "012843217", 5.5);
        sm1.addSMS(2, "be  rbebeb");
        sm1.addSMS(3, "rtnw  nerhh");
        sm1.addSMS(3, "ge eg eg eg eg");

        System.out.println(sm1.getAnzahlSMS());
        sm1.removeSMS(2);
        System.out.println(sm1.getAnzahlSMS());
    }
}
