package org.example.recursion;

public class CheckPalindrome {

    public static void main(String[] args) {
        char[] input1 = {'m', 'o', 'm'};
        char[] input2 = {'d', 'o', 'g'};

        boolean result = checkPalindrome(input1, 0, input1.length - 1);
        System.out.println("The result should be true: " + result);

        boolean result2 = checkPalindrome(input2, 0, input2.length - 1);
        System.out.println("The result should be false: " + result2);

    }

    static boolean checkPalindrome(char[] string, int start, int end) {
        // if there is only one character
        if (start == end) return true;

        if (string[start] != string[end]) return false;

        if (start < end) {
            return checkPalindrome(string, start + 1, end - 1);
        }

        return true;
    }
}
