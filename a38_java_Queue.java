package Java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SplittableRandom;

public class a38_java_Queue {
    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
