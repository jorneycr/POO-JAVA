package dataStructures.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExerciseTest {

    ArrayExercise arrayExercise = new ArrayExercise();

    @Test
    public void testArrayToUpperCase(){
        String[] input = new String[]{"cat", "dog", "fish"};
        arrayExercise.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }

    @Test
    public void testIncrementArray(){
        int[] input = new int[]{1,2,3,4,5};
        arrayExercise.incrementArray(input);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, input);
    }
}
