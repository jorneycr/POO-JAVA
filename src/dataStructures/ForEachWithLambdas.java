package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        printMap_forEach();
    }

    public static void printMap_forEach(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 85);
        fruitCalories.put("orange", 75);

        fruitCalories.forEach((k, v) -> System.out.println(k + " : "+ v));
    }

}
