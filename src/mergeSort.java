public class mergeSort {
    public static void conqure(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int id1 = si;
        int id2 = mid + 1;
        int x = 0;

        while (id1 <= mid && id2 <= ei) {
            if (arr[id1] <= arr[id2]) { // changed < to <= to ensure stability
                merged[x++] = arr[id1++];
            } else {
                merged[x++] = arr[id2++];
            }
        }

        // Copy remaining elements from the left subarray, if any
        while (id1 <= mid) {
            merged[x++] = arr[id1++];
        }

        // Copy remaining elements from the right subarray, if any
        while (id2 <= ei) {
            merged[x++] = arr[id2++];
        }

        // Copy the merged elements back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 3, 8, 2, 1, 7, 5};
        int n = arr.length;
        divide(arr, 0, n - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
