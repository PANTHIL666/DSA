import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the element to be searched: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int li = 0;
        int hi = arr.length-1;
        while(li<=hi){
            int mid = li + (hi-li)/2;
            if(arr[mid]==n){
                System.out.println("element at index "+mid+"  index..");
                return;
            }else if(arr[mid]<n){
                li=mid+1;
            }else
                hi=mid-1;
        }

            System.out.println("element is not found");

    }
}
