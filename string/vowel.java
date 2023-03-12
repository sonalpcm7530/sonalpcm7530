package other.string;

public class vowel {
    public static void main(String[] args) {
        String arr = "aello ";
        char obj = arr.charAt(0);
        if (obj == 'a' || obj == 'e' || obj == 'i' || obj == 'o' || obj == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
        // ascii value
        int a = obj;
        System.out.println(a);
        // lemgth of a character
        // strlen(obj);
        // System.out.println(strlen(arr));
        int lens = 0;
        for (int i = 0; i < arr.length(); i++) {
            lens++;
        }
        System.out.println(lens);
    }
}
