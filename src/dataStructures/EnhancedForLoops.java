package dataStructures;

import java.util.*;

public class EnhancedForLoops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        for (String fruit: fruits){
            System.out.println(fruit);
        }

        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 85);
        fruitCalories.put("orange", 75);

        for (Map.Entry calor: fruitCalories.entrySet()){
            System.out.println(calor.getKey() + ":"+ calor.getValue());
        }
    }
}
