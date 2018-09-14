package DC_A37;

import java.util.*;

public class Aufgabe {
    public static Collection<String> fill(Collection<String> x)
    {
        x.add("DSDS");
        x.add("SWT");
        x.add("Analysis");
        x.add("SWT");
        return x;
    }
    public static void main(String[] args)
    {
        Collection<String> y;

        y = fill(new LinkedList<String>());
        for (Iterator it = y.iterator(); it.hasNext(); )
            System.out.println(it.next());

        System.out.println();

        y = fill(new TreeSet<String>());
        for (Iterator it = y.iterator(); it.hasNext(); )
            System.out.println(it.next());
    }
}