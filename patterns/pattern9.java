package other.patterns;

public class pattern9 {
    public static void main(String[] args) {
        int count = 4 + 1;
        for (int i = 5; i >= 1; i--) {
            // count++;
            for (int j = i; j <= i; j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}
