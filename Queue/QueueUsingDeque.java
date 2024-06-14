package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue{
        static Deque<Integer> deque=new LinkedList<>();
        
        public void add(int data){
            deque.addLast(data);

        }
        public int remove(){
            return deque.getFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(20);
        q.add(3);
        q.add(4);
        System.out.println(q.peek()+" ");
        q.remove();
        q.remove();
        System.out.println(q.peek());
        // System.out.println(q);

    }
    
}
