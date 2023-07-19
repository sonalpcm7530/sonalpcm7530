package Array_Data_Structure;

public class sum_natural {
    // iterative method
    public static int sum(int n) {
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += i;
        }
        return sum1;
    }

    // recursion
    public static void sum_rec(int i, int n, int sum) {
        // base case
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum_rec(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int r = sum(12);
        System.out.println(r);
        sum_rec(1, 5, 0);
    }
}
