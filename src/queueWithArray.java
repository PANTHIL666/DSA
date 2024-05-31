public class queueWithArray {
    public static class Queue {
        int[] array;
        int size;
        int rear;

        public Queue(int n) {
            size = n;
            array = new int[n];
            rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        // Enqueue operation
        public void add(int data){
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }
            array[++rear] = data;
        }

        // Dequeue operation
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = array[0];
            for(int i = 0; i < rear; i++){
                array[i] = array[i + 1];
            }
            rear--;
            return front;
        }

        // Peek element of queue
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return array[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
