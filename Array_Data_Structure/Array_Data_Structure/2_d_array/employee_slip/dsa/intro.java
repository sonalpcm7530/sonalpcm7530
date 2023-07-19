
public class intro {
    public static void main(String[] args) {
        int[][] x = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ,");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ,");
            }
            System.out.println();
        }
    }
}
