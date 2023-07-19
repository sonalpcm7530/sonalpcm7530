//package employee_slip.dsa java.Array_Data_Structure.Array_Data_Structure.Array_Data_Structure;

import java.util.ArrayList;

class count_sum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        int sum = 90;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        int currSum = arr[0];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (currSum == sum) {
                break;
            } else if (currSum + arr[i] > sum) {
                al.remove(0);
                currSum -= arr[j++];
                al.add(arr[i]);
                currSum += arr[i];
            } else {
                al.add(arr[i]);
                currSum += arr[i];
            }
        }
        for (int x : al) {
            System.out.println(x);
        }
    }
}
