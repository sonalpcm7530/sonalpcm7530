package Array_Data_Structure;

public class test {
    static int rec(int num) {
        return (num == 1) ? 0 : num % 10 + rec(num / 10);
    }

    public static void main(String args[]) {
        System.out.println(rec(4));

    }
}
