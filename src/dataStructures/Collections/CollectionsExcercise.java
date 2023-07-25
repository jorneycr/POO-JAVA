package dataStructures.Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;

public class CollectionsExcercise {
    void addToEndOfLinkedList(LinkedList<Integer> numbers, int i){
        numbers.add(i);
    }

    void addToStartOfLinkedList(LinkedList<Integer> numbers, int i){
        numbers.addFirst(i);
    }

    void removeItemFromTopOfStack(Deque<Integer> stack){
        stack.pop();
    }


}
