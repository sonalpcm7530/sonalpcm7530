package other.patterns;

public class pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
