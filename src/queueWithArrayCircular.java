public class queueWithArrayCircular {
    public static class Queue {
        int[] array;
        int size;
        int rear;
        int front;

        public Queue(int n) {
            size = n;
            array = new int[n];
            rear = -1;
            front = -1;
        }

        // Checking if the queue is empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Checking if the queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add data to the queue
        public void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //if it's first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = x;
        }

        // Remove an element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int res = array[front];
            // If only one element is present
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        // Peek the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(6);
        System.out.println(q.dequeue());
        q.enqueue(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
