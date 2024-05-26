import java.util.ArrayList;

public class stackWithArrayList {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<Integer>();
        public static boolean empty(){
            return list.size() == 0;
        }
        public static void push(int x){
            list.add(x);
        }
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int x = list.get(list.size()-1);
            list.remove(list.size()-1);
            return x;
        }
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while(!stack.empty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println("now stack is Empty........");
    }
}
