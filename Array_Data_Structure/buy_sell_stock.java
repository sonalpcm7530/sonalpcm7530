package Array_Data_Structure;

public class buy_sell_stock {
    // using nested loop
    static void approach1(int arr[]) {
        int n = arr.length;
        int first = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (max < (arr[j] - arr[i])) {
                    max = arr[j] - arr[i];
                    first = arr[i];
                    last = arr[j];
                }
            }
        }
        System.out.println(first + " " + last);
    }

    // optimized approach
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int finalprofit = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            finalprofit = prices[i] - min;
            profit = Math.max(finalprofit, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit(arr);
        System.out.println(result);
    }
}
