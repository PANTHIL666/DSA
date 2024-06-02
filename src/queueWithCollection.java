import java.util.*;
public class queueWithCollection {
    public static void main(String[] args) {
        //queue is interface so we have to implement this interface with linklist or Array queue
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
