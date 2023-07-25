package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 85);
        fruitCalories.put("orange", 75);
        fruitCalories.put("lemon", 65);
        fruitCalories.put("lemon",17);
        fruitCalories.putIfAbsent("apple",00);
        fruitCalories.remove("orange");
        Set mapEntries = fruitCalories.entrySet();
        Set mapKeys = fruitCalories.keySet();

        System.out.println(mapEntries);
        System.out.println(mapKeys);

        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("banana"));
    }
}
