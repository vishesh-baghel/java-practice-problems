package org.example.arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 1};
        int secondLargest = findSecondLargestInArray(inputArray);
        System.out.println("the expected second largest element in the array is 34 and you found " + secondLargest);
    }

    private static int findSecondLargestInArray(int[] inputArray) {
        if (inputArray.length < 2) {
            return -1;
        }
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        int index = 0;
        while (index < inputArray.length) {
           largest = Math.max(inputArray[index], largest);
           if (inputArray[index] != largest) {
               secondLargest = Math.max(secondLargest, inputArray[index]);
           }
           index++;
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }
}
