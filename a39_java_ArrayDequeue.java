package Java;

import java.util.ArrayDeque;

public class a39_java_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        //In array dequeue we can add and delete element from front and end
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

    }
}
