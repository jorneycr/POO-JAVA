package dataStructures.Collections;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class CollectionsExcerciseTest {

    CollectionsExcercise collectionsExcercise = new CollectionsExcercise();

    @Test
    public void testAddSixToEndOfLinkedList(){
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        collectionsExcercise.addToEndOfLinkedList(numbers, 6);
        assertEquals(Integer.valueOf(6), numbers.getLast());
    }

    @Test
    public void testAddZeroToStartOfLinkedList(){
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        collectionsExcercise.addToStartOfLinkedList(numbers, 0);
        assertEquals(Integer.valueOf(0), numbers.getFirst());
    }

    @Test
    public void testRemoveItemFromTopOfStack(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        collectionsExcercise.removeItemFromTopOfStack(stack);
        assertEquals(Integer.valueOf(4), stack.peek());
    }

}
