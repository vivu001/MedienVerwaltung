package Map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key4", "value4");

        System.out.println(map);

        System.out.println(map.keySet());


    }


}
