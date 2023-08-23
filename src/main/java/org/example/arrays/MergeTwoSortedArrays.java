package org.example.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    /*
    Description : We are given two sorted arrays arr1[ ] and arr2[ ] of size m and n respectively.
    We have to merge these arrays and store the numbers in arr3[ ] of size m+n.
    Input
    1 3 4 6
    2 5 7 8
    Output
    1 2 3 4 5 6 7 8
    */

    static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int mergedArrayIndex = 0;
        while (firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length) {
            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
                mergedArray[mergedArrayIndex++] = firstArray[firstArrayIndex++];
            } else {
                mergedArray[mergedArrayIndex++] = secondArray[secondArrayIndex++];
            }
        }
        while(firstArrayIndex < firstArray.length) {
            mergedArray[mergedArrayIndex++] = firstArray[firstArrayIndex++];
        }
        while(secondArrayIndex < secondArray.length) {
            mergedArray[mergedArrayIndex++] = secondArray[secondArrayIndex++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1, 3, 4, 6};
        int[] inputArray2 = {2, 5, 7, 8};
        int[] mergedArray = mergeSortedArrays(inputArray1, inputArray2);
        System.out.println("the expected array is {1, 2, 3, 4, 5, 6, 7, 8} and your array is: " + Arrays.toString(mergedArray));
    }
}
