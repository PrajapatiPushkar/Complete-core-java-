package src.CollectionsFramework.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(2);
        queue.offer(11);
        queue.offer(1);
        queue.poll();
        System.out.println(queue.peek());

        Queue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(2);
        queue.offer(11);
        queue.offer(1);
//        queue.poll();
        System.out.println(maxPq.peek());

    }
}
