package Array_Data_Structure;

public class upper_lower {
    public static void sum(int arr[][]) {
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= j) {
                    upper += arr[i][j];
                }
            }
        }
        // lower sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i >= j) {
                    lower += arr[i][j];
                }
            }
        }
        System.out.println("Upper sum: " + upper);
        System.out.println("Lower sum: " + lower);

    }

    public static void main(String[] args) {
        int arr[][] = {

                { 6, 5, 4 }, { 1, 2, 5 }, { 7, 9, 7 }
        };
        sum(arr);

    }
}
