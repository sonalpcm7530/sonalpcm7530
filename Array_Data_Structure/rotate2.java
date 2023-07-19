package Array_Data_Structure;

public class rotate2 {
    static void rotate_array(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 8, 2 };
        rotate_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
