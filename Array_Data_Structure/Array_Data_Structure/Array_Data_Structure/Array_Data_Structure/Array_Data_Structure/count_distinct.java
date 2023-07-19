import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class count_distinct {
    public static int count(int arr[], int k) {
        int d = 0;
        // int n = arr.length;
        for (int i = 0; i < k; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == i) {
                d++;
            }
        }
        return d;
    }

    public static void distinct_window(int arr[], int n, int k) {
        // int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            System.out.print(count(Arrays.copyOfRange(arr, i, arr.length), k) + "  ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 6, 6, 7, 7 };
        int slide = 4;
        distinct_window(arr, arr.length, slide);
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i+slide-1<arr.length;i++){
        // map=new HashMap<>();
        // int k=0,j=i;
        // while(k<slide){
        // if(map.get(arr[j]) ==null){
        // map.put(arr[j], 1);

        // }else{
        // int f=map.get(arr[j])+1;
        // map.put(arr[j], f);
        // }
        // j++;
        // k++;
        // }
        // int count=0;
        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        // if(e.getValue()==1){
        // count++;
        // }

        // }
        // System.out.println(count);
        // }
    }
}
