package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");
        System.out.println(fruits);
        for (Object frut: fruits) {
            System.out.println(frut);
        }
        System.out.println(fruits.contains("lemon"));
        fruits.remove("lemon");
        System.out.println(fruits.size());

        Set moreFruit = Set.of("pear", "cherry");
        System.out.println(moreFruit);

    }
}
