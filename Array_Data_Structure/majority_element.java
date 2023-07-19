package Array_Data_Structure;

public class majority_element {
    static int approach1(int arr[], int n) {
        int majority = n / 2;
        for (int num : arr) {
            int count = 0;
            for (int element : arr) {
                count += 1;
            }

            if (count > majority) {
                return num;

            }
        }

        return majority;

    }

    // optimized approach Boyer moores voting algorithm
    static int approach2(int arr[], int n) {
        int count = 0;
        int majority = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                majority = arr[i];
            }
            if (majority == arr[i]) {
                count++;
            } else {
                count--;
            }

        }
        return majority;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 1, 1, 2, 2, 2, 2 };
        int n = arr.length;
        approach2(arr, n);
    }
}
