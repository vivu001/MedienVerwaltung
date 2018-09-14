package DC_A35;

    import java.util.*;
    class Aufgabe
    {
        public static Map<String, Integer> fuellen(Map<String, Integer> tabelle)
        {
            tabelle.put("Dortmund", 581308);
            tabelle.put("Essen", 576259);
            tabelle.put("Oberhausen", 214024);
            tabelle.put("Bochum", 376319);

            return tabelle;
        }

        public static void ausgeben(String text, Map<String, Integer> tabelle)
        {
            System.out.println( text );

            Set<Map.Entry<String, Integer>> set = tabelle.entrySet();
            Iterator<Map.Entry<String, Integer>> it = set.iterator();

            while (it.hasNext())
            {
                Map.Entry<String, Integer> eintrag = it.next();
                System.out.println(eintrag.getKey() + " --> " + eintrag.getValue());
            }
        }

        public static void main(String[] args)
        {
            Map<String, Integer> staedte;

            staedte = fuellen(new HashMap<>());
            staedte.put("Hanoi", 184731);
            ausgeben("Ausgabe 1:", staedte);

            System.out.println();

            staedte = fuellen(new TreeMap<>());
            staedte.put("Hanoi", 184731);
            ausgeben("Ausgabe 2:", staedte );
        }
    }
