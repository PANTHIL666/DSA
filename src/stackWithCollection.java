import java.util.Stack;  //importing stack package...
                        //Stack follows FILO Sequence
public class stackWithCollection {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Pushing an element in Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        //checking top of stack
        int PeekElement=stack.peek();
        System.out.println(PeekElement);
        System.out.println(stack);

        //Removing Element From Stack
        int PopElement=stack.pop();
        System.out.println(PopElement);
        System.out.println(stack);

        int PopElement2=stack.pop();
        System.out.println(PopElement2);
        System.out.println(stack);

        //Checking stack is Empty or not
        boolean Empty=stack.isEmpty();
        System.out.println(Empty);

        int PopElement3=stack.pop();
        System.out.println(PopElement3);
        System.out.println(stack);

        int PopElement4=stack.pop();
        System.out.println(PopElement4);
        System.out.println(stack);

        int PopElement5=stack.pop();
        System.out.println(PopElement5);
        System.out.println(stack);

        boolean Empty2=stack.isEmpty();
        System.out.println(Empty2);
        }
    }

