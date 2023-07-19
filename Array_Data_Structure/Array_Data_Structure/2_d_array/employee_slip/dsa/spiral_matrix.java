//package employee_slip.dsa java.Array_Data_Structure.Array_Data_Structure.2_d_array.employee_slip.dsa;

public class spiral_matrix {
    public static void matrix(int arr[][], int m, int n) {
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; i++) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (i = k; i < m; i++) {
                System.out.print(arr[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(arr[m - 1][i] + " ");
                }
                m--;
                if (l < n) {
                    for (i = m - 1; i >= k; --i) {
                        System.out.println(arr[i][l] + " ");
                    }

                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        matrix(arr, 4, 4);
    }
}
