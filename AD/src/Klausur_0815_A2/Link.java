package Klausur_0815_A2;

public class Link {
    public Link naechster;

    public Link(Link naechster) {
        this.naechster = naechster;
    }
}

class Liste {
    protected Link anfang;

    public Liste(Link anfang) {
        this.anfang = anfang;
    }

    public Link getVorgaenger(Link li) {
        if (li == anfang) return null;

        Link zeiger = anfang;
        while (zeiger.naechster != li) {
            zeiger = zeiger.naechster;
        }
        return zeiger;
    }

    public static void main(String[] args) {
        Link l4 = new Link(null);
        Link l3 = new Link(l4);
        Link l2 = new Link(l3);
        Link l1 = new Link(l2);

        Liste list = new Liste(l1);
        System.out.println(list.getVorgaenger(l3));
    }
}