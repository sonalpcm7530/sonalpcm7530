package other.patterns;

public class pattern10 {
    public static void main(String[] args) {
        // int count = 3;
        for (int i = 3; i <= 12; i++) {
            for (int j = 3; j <= i; j++) {
                System.out.print(i);
                // count++;
            }
            System.out.println(" ");
        }
    }
}
