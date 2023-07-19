package Array_Data_Structure;

public class reverse {
    // two pointer approach
    // swapping approach
    static void reverse_array(int arr[], int n) {
        int i = 0, j = n - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        reverse_array(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
