package other.patterns;

public class pattern11 {
    public static void main(String[] args) {
        int count = 3;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
