package Java;

import java.util.ArrayList;

public class a38_java_ArraylistLinklist {
    public static void main(String[] args) {
        //NOTE :- GO AND SEARCH [JAVA 21(VERSION) DOCUMENTATION] ON GOOGLE AND GO TO
                  // FIRST WEBSITE AND THERE YOU GET ALL METHODS AND ALL TOPICS.

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l2.add(49);
        l2.add(59);
        l2.add(46);
        l1.addAll(l2);
        l2.clear();
        l1.set(2,544);
        for (int i =0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
