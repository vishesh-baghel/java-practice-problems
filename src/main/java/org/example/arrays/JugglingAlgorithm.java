package org.example.arrays;

public class JugglingAlgorithm {
    /*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int[] arr, int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    void printArray(int[] arr) {
        int i;
        for (i = 0; i < 7; i++)
            System.out.print(arr[i] + " ");
    }

    void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*Function to get gcd of a and b*/
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        JugglingAlgorithm rotate = new JugglingAlgorithm();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr);
    }
}
