package Queue;

public class QueueImplementArray {
    static class Queue {
        private int array[];
        private int size;
        private int rear;

        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public String add(int data) {
            if (rear == size - 1) {
                return "full";
            }
            rear++;
            array[rear] = data;
            return "added";
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.add(1)); // added
        System.out.println(q.add(2)); // added
        System.out.println(q.add(3)); // added

        // Attempt to add more elements than the capacity
        for (int i = 4; i <= 7; i++) {
            System.out.println(q.add(i)); // full
        }

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
