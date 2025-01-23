package Java;

import java.util.LinkedList;
import java.util.List;

public class a38_java_LinkedList {
    public static void main(String[] args){
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls.get(1));
        System.out.println(ls.size());
    }
}
