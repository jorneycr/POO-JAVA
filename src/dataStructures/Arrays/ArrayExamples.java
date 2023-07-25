package dataStructures.Arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] weekdays = new String[7];

        weekdays[0] = "Monday";

        weekdays = new String[]{"Mon", "Tue", "Wed"};

        System.out.println(Arrays.toString(weekdays));

        for (String day: weekdays){
            System.out.println(day);
        }

        for(int i = 0; i < weekdays.length; i++){
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));
    }
}
