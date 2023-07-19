public class nbonacci {
    public static void main(String[] args) {
        // int arr[]={};
        int slides = 3;
        int nthterm = 15;
        int arr[] = new int[nthterm];
        for (int i = 0; i < slides; i++) {
            arr[i] = 0;
        }
        arr[slides - 1] = 1;
        int start = -1;
        int second = 0;
        for (int i = slides; i < arr.length; i++) {
            if (start != -1) {
                second = arr[i - 1] - arr[start];
                arr[i] = arr[i - 1] + second;
            } else {
                arr[i] = arr[i - 1];
            }
            start++;
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }

    }
}
