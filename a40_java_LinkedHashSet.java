package Java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class a40_java_LinkedHashSet {
    public static void main(String[] args) {
//      store different elements,( convert elements into hash ), ordered
        HashSet<Integer> l1 = new LinkedHashSet<>();
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
