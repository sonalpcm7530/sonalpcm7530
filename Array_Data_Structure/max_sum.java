package Array_Data_Structure;

//max sum of consecutive element
public class max_sum {
    // sliding window approach
    static void approach2(int arr[], int k) {
        int slidesum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            slidesum = slidesum + arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            slidesum = slidesum + arr[i] - arr[i - k];
            if (slidesum > maxsum) {
                maxsum = slidesum;
            }
        }

    }

    // naive approach
    static void approach1(int arr[], int k) {
        int maxsum = 0;
        for (int i = 0; i + k - 1 < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 40, 30, 10, 20, 5 };
        int k = 3;

    }
}
