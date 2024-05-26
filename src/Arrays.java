import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements Which you want to search:");
        int cnummber = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==cnummber) {
                System.out.println("this number is found");
            }
            else{
                System.out.println("this number is not found");
            }
        }
    }
}
