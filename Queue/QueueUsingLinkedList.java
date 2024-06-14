package Queue;

public class QueueUsingLinkedList {
    public class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class Queue {
        Node head = null;
        Node tail = null;
        
        public boolean isEmpty() {
            return head == null && tail == null;
        }
        
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        
        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            if (head == tail) {
                tail = head = null;
            } else {
                head = head.next;
            }
        }
        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        Queue queue = queueUsingLinkedList.new Queue();

        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        queue.remove();
        queue.remove();
        queue.remove();

        // Try to peek after dequeueing all elements
        System.out.println("Front element after dequeuing: " + queue.peek());
    }
}
