package DC_A7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<String> list2 = new ArrayList<>();
        list2.add("5");
        list2.add("6");
        list2.add("7");

        for (Pair element : verschmelzen(list1, list2)) {
            System.out.println(element);
        }
    }

    public static List<Pair> verschmelzen(List<String> erste, List<String> zweite) {
        List<Pair> erg = new ArrayList<>();

        for (int i = 0; i < erste.size(); i++) {
            erg.add(new Pair(erste.get(i), zweite.get(i)));
        }

        return erg;
    }
}