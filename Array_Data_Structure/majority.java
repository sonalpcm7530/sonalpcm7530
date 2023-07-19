package Array_Data_Structure;

import java.util.*;

public class majority {
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int majorityElement = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                majorityElement = entry.getKey();
            }
        }
        if (maxFrequency > n / 2) {
            return majorityElement;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 3 };
        int majorityElement = findMajorityElement(nums);
        if (majorityElement != -1) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("no majority exist");
        }
    }
}
