package Java;

import java.util.LinkedList;
import java.util.List;

public class a38_java_LinkedList {
    class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
   }

        
    


    public static void main(String[] args){
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls.get(1));
        System.out.println(ls.size());

        int[] arr = {2, 5, 6, 8};
        Node y = new Node(arr[3]); // arr[3] = 8
        System.out.print(y.data);  // should print 8
    }
}
