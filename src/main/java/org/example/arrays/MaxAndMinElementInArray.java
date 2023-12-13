package org.example.arrays;

public class MaxAndMinElementInArray {
    public static int maximumElement(int arr[],int n)
    {
        // Your code here
        int maxElement = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;

    }

    public static int minimumElement(int arr[],int n)
    {
        // YOUR code here
        int minElement = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] <= minElement) {
                minElement = arr[i];
            }
        }

        return minElement;
    }
}
