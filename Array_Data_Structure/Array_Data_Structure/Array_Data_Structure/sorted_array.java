//package Array_Data_Structure;

public class sorted_array {
    static void approach(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    System.out.println("Array not sorted");
                } else {
                    System.out.println(" sorted");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 9, 22, 19 };
        int n = arr.length;
        approach(arr, n);
    }
}
