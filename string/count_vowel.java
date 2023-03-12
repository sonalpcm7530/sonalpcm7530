package other.string;

import java.util.Arrays;

//import java.io.*;

public class count_vowel {
    public static void main(String[] args) {
        String str = "Welcome to dit";
        int length = strlen(str);
        System.out.println(length);
        cout_vowels(str);
        String str1 = "prepinsta";
        palindrome_check(str1);
        reverse_string(str);
        replaceVowels(str);
        toggel_string(str);
        String str2 = "abcfg";
        alphabet_check(str2);
        character_remove(str2);
        remove_space(str);
        String str3 = "12prep678";
        count_sum(str3);
        if (anagram_check(str, str1)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
        string_replace(str3, str2);
        replace_particular(str2);
        non_repeating(str1);
    }

    // length of a string
    public static int strlen(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // vowel counts
    public static void cout_vowels(String str) {
        int count = 0;
        // count vowels in a string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    // palindrome string
    public static void palindrome_check(String str1) {
        String rev = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            rev = rev + str1.charAt(i);
        }
        if (rev.equals(str1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    // print all string in reverse order
    public static void reverse_string(String str) {

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    // remove vowels from string
    // using .replaceAll() function
    public static String replaceVowels(String str) {
        // String res = "";
        // for(int i=0;i<str.length();i++){
        return str.replaceAll("[aeiouAEIOU]", "");

        // }
    }

    // toggel means convert in uppercase or lowercase
    public static void toggel_string(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result = result + Character.toLowerCase(str.charAt(i));
            } else {
                result = result + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(result);
    }

    // check whether input is character is not
    public static void alphabet_check(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.println("contains aplphabet");
            } else {
                System.out.println("not contains");
            }
        }
    }

    // remove characters from string except alphabet
    public static void character_remove(String str) {
        String result = "";
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) >= 'i' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' &&
        // str.charAt(i) <= 'Z') {
        result = result + str.replaceAll("[0-9]", result);
        // }
        // }
        System.out.println(result);
    }

    // remove space from string using string buffer
    public static void remove_space(String str) {
        char c[] = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if ((c[i] != ' ') && (c[i] != '\t')) {
                sb.append(c[i]);
            }
        }
        System.out.println(sb);
    }

    // count the sum of string
    public static void count_sum(String str) {
        int sum = 0;
        // char c=str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum = sum + (str.charAt(i) - '0');
            }
        }
        System.out.println(sum);
    }
    // capitalize the first and last character of string

    // anagram or not
    public static boolean anagram_check(String str1, String str2) {
        boolean status = true;
        String s1 = str1.replaceAll("[\\s]", "");
        String s2 = str2.replaceAll("[\\s]", "");
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] a1 = s1.toLowerCase().toCharArray();
            char[] a2 = s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            status = Arrays.equals(a1, a2);

        }
        return status;
    }

    // replace a string
    public static void string_replace(String s1, String s2) {
        String str3 = s1.replace(s1, s2);
        System.out.println(str3);
    }

    // replace particular character
    public static void replace_particular(String str1) {
        // char c = str1.charAt(0);
        String s3 = "x";
        // String s4 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a') {
                str1 = str1.replaceAll("a", s3);
            }
        }
        System.out.println(str1);
    }

    // First non repeating character in a string
    // use indexof and lastindexoff()
    public static void non_repeating(String str) {
        boolean flag = true;
        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.print(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("norepeating character");
        }
    }
}
