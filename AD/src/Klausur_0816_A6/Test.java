package Klausur_0816_A6;

public class Test {
    public static void main(String[] args) {
        Liste list = new Liste();

        for (int i = 5; i >= 1; --i ) {
            list.einfuegenAnfang(i);
        }

        list.display();
//        list.leeren();
//        list.display();

        System.out.println();
        System.out.println(list.hatGeradeAnzahl());
    }
}
