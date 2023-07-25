package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.set(2,"grape");
        fruits.add("apple");
        fruits.remove(1);

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println("Index: "+ fruits.lastIndexOf("apple"));

        //inmutable
        List moreFruit = List.of("Cherry","Tee");

    }
}
