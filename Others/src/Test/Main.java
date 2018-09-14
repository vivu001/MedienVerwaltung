/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Vu Viet Duc
 */
public class Main {

    public static void main(String[] args) {
        String[] str = {"c", "c", "c", "c"};
//        System.out.println(str[1].substring(str[1].length()-1, str[1].length()));

        wordMultiple(str).forEach((k,v) -> System.out.println("Key : " + k + " Value : " + v));

    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
       Map<String, Boolean> map = new TreeMap<>();

        for (String s : strings) {
            if (map.containsKey(s))
                map.put(s, true);
            else map.put(s, false);
        }

        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : strings) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }

        return map;
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new TreeMap<>();

        for (String s : strings) {
            if (map.containsKey(s.substring(0,1)))
                map.put(s.substring(0,1), map.get(s.substring(0,1)) + s);
            else map.put(s.substring(0,1), s);
        }

        return map;
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String,String> map = new TreeMap<>();

        for (String s : strings)
            map.put(s.substring(0,1), s.substring(s.length()-1, s.length()));

        return map;
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : strings)
            map.put(s, s.length());

        return map;
    }
}