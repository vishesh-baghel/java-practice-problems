package org.example.arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int n = 4;

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) System.out.println(arr[i] + " ");

        int[] reversedArray = reverse(arr, n);
        System.out.println("Reversed Array: ");
        for (int i = 0; i < n; i++) System.out.println(reversedArray[i] + " ");
    }

    public static int[] reverse(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i -1];
            arr[n - i -1] = temp;
        }
        return arr;
    }
}
