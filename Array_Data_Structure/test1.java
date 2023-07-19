package Array_Data_Structure;

public class test1 {
    public static void search_element(int arr[], int key) {
        int temp[] = new int[arr.length];
        int count = 0;
        int n = arr.length - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == key) {
                count = temp[i];
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(temp[i]);

        }

    }

    public static void main(String args[]) {
        int n = 10;
        for (int i = 1; i < 10; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
