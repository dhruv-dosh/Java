package Java;

import java.util.HashSet;

public class a40_java_Hashset {
    public static void main(String[] args) {
//      store different elements,( convert elements into hash ), random order
        HashSet<Integer> l1 = new HashSet<>();
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(7);
        System.out.println(l1);
        l1.remove(6);
        l1.contains(4);
        l1.isEmpty();
        l1.size();
        l1.clear();
    }
}
