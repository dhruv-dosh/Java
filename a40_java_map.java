package Java;

import java.util.HashMap;
import java.util.Map;

public class a40_java_map {
    public static void main(String[] args) {
        //key value pairs
//        MAP
//        1.HashMap.
//        2.TreeMap. (TreeMap is same but in Trees key pairs are sorted)
//        3.LinkedHashMap.

        /*
        HashMap:

Does not guarantee any specific order for keys or values.
Fast for retrieval but unordered.
LinkedHashMap:

Preserves the order in which key-value pairs were inserted.
Useful when you need predictable iteration order.
TreeMap:

Stores keys in their natural order (or based on a custom comparator if provided).
Useful for sorted data.
         */

        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"Dhruv");
        mp.put(4,"payas");
        mp.put(3,"payas");
        mp.put(2,"Doshi");
        mp.put(5,"payas");
        mp.putIfAbsent(3,"payas");
        System.out.println(mp);
        mp.isEmpty();
        mp.remove(3);


        for (Map.Entry<Integer,String> e : mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        for(Integer ke : mp.keySet()){
            System.out.println(ke);
        } // same for value
    }
}
