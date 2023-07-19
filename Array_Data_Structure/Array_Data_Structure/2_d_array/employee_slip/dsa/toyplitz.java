
public class toyplitz {
    public static boolean check_toyplitz(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {

                    return false;
                }

            }
        }
        return true;
    }

    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // transpose matrix check
    // basically swap arr[i][j]=arr[j][i];
    public static void check_transpose(int matrix[][]) {
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        print(matrix);
        System.out.println("After transpose  ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        print(matrix);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 1, 2, 3 },
                { 4, 5, 1, 2 }
        };

        // System.out.println(check_toyplitz(matrix));
        int matrix1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }

        };
        check_transpose(matrix1);

    }
}
