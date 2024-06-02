public class queueWithLinklist {
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

        // Check if queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add data into queue
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Remove data from queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = head.data;
            if (head == tail) { // single node exists
                tail = null;
            }
            head = head.next;
            return data;
        }

        // Peek the element in queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queueWithLinklist qwl = new queueWithLinklist();
        Queue q = qwl.new Queue(); // instantiate Queue using an instance of the outer class
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
