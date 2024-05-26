import java.util.*;
import java.util.LinkedList;

public class linkListWithCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        int Size=list.size();
        System.out.println(Size);

        list.addLast("list");
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"->");
        }
        System.out.println("Null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        System.out.println(list);

        String val="a";
        if(list.contains(val)){
            boolean remove = list.remove(val);
        }
        System.out.println(list);

    }
}
