package dataStructures.LinkedLists;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();

        shoppingList.add("Apple");
        shoppingList.add("Banana");
        shoppingList.add("Pear");

        System.out.println(shoppingList);

        shoppingList.add(1,"Mango");

        shoppingList.remove(0);
        shoppingList.addLast("Uva");
        shoppingList.removeFirst();

        shoppingList.forEach(System.out::println);
    }
}
