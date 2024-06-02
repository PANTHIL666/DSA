import java.util.Stack;
public class queueWith2Stack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public  boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void push(int node) {
        while (!stack1.isEmpty() ) {
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while (!stack2.isEmpty() ) {
            stack1.push(stack2.pop());
        }
    }
    public int pop() {
        return stack1.pop();
    }
    public int peek() {
        return stack1.peek();
    }
    public static void main(String[] args) {
        queueWith2Stack q = new queueWith2Stack();
        q.push(1);
        q.push(2);
        q.push(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }

}
