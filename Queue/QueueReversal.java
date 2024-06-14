package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void printQueue(Queue<Integer> q) {
        Queue<Integer> tempQueue = new LinkedList<>(q); // Create a temporary queue to iterate over
        while (!tempQueue.isEmpty()) {
            System.out.print(tempQueue.peek() + " ");
            tempQueue.remove();
        }
    }

    public static void Reversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        printQueue(q);
        Reversal(q);
        System.out.println();
        printQueue(q);
    }
}
