package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");

        var removed = fruits.remove();
        System.out.println(removed);
        System.out.println(fruits);
        System.out.println(fruits.peek());
    }
}
