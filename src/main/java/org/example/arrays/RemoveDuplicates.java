package org.example.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 4, 5};
        int[] inputArray2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] inputArray3 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] inputArray4 = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int[] inputArray5 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

        int[] result = removeDuplicates(inputArray);
        int[] result2 = removeDuplicates(inputArray2);
        int[] result3 = removeDuplicates(inputArray3);
        int[] result4 = removeDuplicates(inputArray4);
        int[] result5 = removeDuplicates(inputArray5);

        System.out.println("expected array is [1, 2, 3, 4, 5] and you found " + printArray(result));
        System.out.println("expected array is [1] and you found " + printArray(result2));
        System.out.println("expected array is [1, 2, 3, 4, 5, 6, 7, 8] and you found " + printArray(result3));
        System.out.println("expected array is [1, 2, 3, 4, 5, 6, 7, 8] and you found " + printArray(result4));
        System.out.println("expected array is [1, 2, 3, 4, 5] and you found " + printArray(result5));
    }

    static String printArray(int[] array) {
        return Arrays.toString(array);
    }

    static int[] removeDuplicates(int[] inputArray) {
        if (inputArray.length == 1) {
            return inputArray;
        }
        int index = 1;
        while (index < inputArray.length) {
            if (inputArray[index - 1] == inputArray[index]) {
                inputArray[index - 1] = inputArray[index];
            }
            index++;
        }
        return inputArray;
    }

    static void deleteElement(int[] inputArray, int element) {

    }
}
