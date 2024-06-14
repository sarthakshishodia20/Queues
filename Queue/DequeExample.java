package Queue;

import java.util.LinkedList;
import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.remove();
        deque.remove();
        System.out.println(deque);
        deque.getFirst();
        deque.getLast();
        System.out.println(deque.getLast());

    }
    
}
