import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(6);
        System.out.println(list);

        //To get element
        int element = list.get(2);
        System.out.println(element);

        //Add element at specific index
        list.add(2,3);
        System.out.println(list);

        //set element at specific index
        list.set(2,4);
        System.out.println(list);

        //Delete element from particular index
        list.remove(2);
        System.out.println(list);

        //Size of list
        int size = list.size();
        System.out.println(size);

        //Iteration in Arraylist
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }

        //Sorting of Arraylist
        Collections.sort(list);
        System.out.println(list);

    }
}
