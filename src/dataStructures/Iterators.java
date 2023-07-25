package dataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        //set, list, queue
        var i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
