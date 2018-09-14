package VL03_A3;

public class Test {
    public static void main(String[] args) {

        Liste list = new Liste();
        for (int i = 1; i <= 10; i++) {
            list.elementAnfuegen(i);
        }

        list.display();
        System.out.println();

        list.bereichEntfernen(6,5);
        list.display();
    }

}
