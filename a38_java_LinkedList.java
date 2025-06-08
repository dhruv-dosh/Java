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

    private static Node convertArr2LL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i = 1; i < arr.length; i++) {
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
    }

    public static void main(String[] args){
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls.get(1));
        System.out.println(ls.size());

        int[] arr = {2, 5, 6, 8};
        Node head = convertArr2LL(arr) 
        Node temp = head;
        while(temp!=null){
          System.out.println(temp.data+"");
          temp = temp.next;
            
       }
}
