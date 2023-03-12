package other.patterns;

public class pattern3 {
    public static void main(String[] args) {
        for (int i = 0; i > 7; i--) {
            for (int j = i; j < 7; j++) {
                System.out.print(" ");
                for (j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }
}
