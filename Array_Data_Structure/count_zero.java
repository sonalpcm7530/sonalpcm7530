package Array_Data_Structure;

public class count_zero {
    static void count_fre(int arr[]) {
        int n = arr.length;
        int c0 = 0;
        int c1 = 1;
        int i = 0;
        while (i < n) {
            if (arr[i] == 0) {
                c0 = c0 + 1;
            } else if (arr[i] == 1) {
                c1 = c1 + 1;
            }
            i = i + 1;
        }
        for (i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (i = c0; i < n; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1 };
        count_fre(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
