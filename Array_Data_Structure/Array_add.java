package Array_Data_Structure;

public class Array_add {
    //

    public static void main(String[] args) {
        int arr1[] = { 9, 1, 8, 9, 2 };
        int arr2[] = { 9, 1, 2, 7 };
        int n1 = arr1.length, n2 = arr2.length;
        int n3 = n1 > n2 ? n1 : n2;
        int result[] = new int[n3];
        int carry = 0, sum = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        while (k >= 0) {
            if (i >= 0 && j >= 0) {
                sum = arr1[i] + arr2[j] + carry;
            } else if (i >= 0 && j < 0) {
                sum = arr1[i] + carry;
            } else if (j >= 0 && i < 0) {
                sum = arr2[j] + carry;
            }
            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            // result[0]=carry;
            System.out.println(carry + " ");
        }
        for (int r : result) {
            System.out.print(r + " ");

        }

    }
}
