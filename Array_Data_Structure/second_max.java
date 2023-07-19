package Array_Data_Structure;

//2nd max element
public class second_max {
    public static int max_element(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // System.out.println("max: " + max);
        return max;

    }

    public void secnd_max(int arr[]) {
        int n = arr.length;
        int second = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] != max_element(arr)) {
                if (arr[i] > second) {
                    second = arr[i];
                }
            }
        }
        System.out.println("2nd max element: " + second);
    }

    // Bar Chart
    static int max(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // System.out.println("max: " + max);
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 13, 56, 78, 23, 8 };
        int arr1[] = { 3, 2, 1, 0, 6, 5 };
        int n = arr1.length;

        // int n=arr.length;
        second_max s1 = new second_max();
        // int x = max_element(arr);
        // System.out.println(x + "");
        // s1.secnd_max(arr);
        int element = max(arr1, n);
        for (int i = element; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (i <= arr1[j]) {
                    System.out.print("*");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }

    }
}
