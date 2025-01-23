package Java;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class a39_java_priorityQueue {
    public static void main(String []args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(23);
        pq.offer(25);
        pq.offer(26);
        System.out.println(pq.peek());
//      polllast , pollfirst, peeklast ,peekfirst

    }
}
