public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 6, 2, 4,3 };
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j=j-1;
            }
                arr[j] = temp;
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
