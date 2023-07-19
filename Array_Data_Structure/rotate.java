package Array_Data_Structure;

import java.util.Arrays;

public class rotate {
    public static void rotate_Clockwise(int[] arr) {
        if (arr.length <= 1)
            return;

        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = lastElement;
    }

    public static void rotate_AntiClockwise(int[] arr) {
        if (arr.length <= 1)
            return;

        int firstElement = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotate_Clockwise(arr);
        System.out.println("Clockwise  " + Arrays.toString(arr));
        rotate_AntiClockwise(arr);
        System.out.println("Anticlockwise :  " + Arrays.toString(arr));
    }
}
