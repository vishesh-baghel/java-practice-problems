package org.example.recursion;

/**
 * Time: O(n)
 * Space: O(n) due to space occupied by function call stack
 */
public class SearchArrayRecursively {

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 5};

        var result = recursiveSearch(input, 0, input.length, 1);
        System.out.println("The result should be true: " + result);
    }

    static boolean recursiveSearch(int[] arr, int start, int end, int elementToFind) {

        if (start > end) return false;

        if (arr[start] == elementToFind) return true;
        if (arr[end - 1] == elementToFind) return true;

        return recursiveSearch(arr, start + 1, end - 1, elementToFind);
    }
}
