package Array_Data_Structure;

public class remove_duplicate {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int x = 0;
        if (n == 0) {
            System.out.println("empty array");
        } else {
            for (int i = 0; i < n; i++) {
                if (nums[x] != nums[i]) {
                    x++;
                    nums[x] = nums[i];
                }
            }
            return x + 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        int ans = removeDuplicates(arr);
        System.out.println(ans);

    }
}
