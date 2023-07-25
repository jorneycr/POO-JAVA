package dataStructures.QueeuExamples;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Apple 1");
        queue.offer("Apple 2");
        queue.offer("Apple 3");

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

    }
}
