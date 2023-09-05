package org.example.arrays;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 0, 6, 0, 0, 1, 0, 23};
        int[] expectedArray = {1, 2, 6, 1, 23, 0, 0, 0, 0};

        int[] result = moveZerosToTheEnd(inputArray);
        System.out.println("The expected array is: " + Arrays.toString(expectedArray));
        System.out.println("And your resulting array is: " + Arrays.toString(result));

    }

    static int[] moveZerosToTheEnd(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0) {
                inputArray[count] = inputArray[i];
                count++;
            }
        }

        while (count < inputArray.length) {
            inputArray[count] = 0;
            count++;
        }

        return inputArray;
    }
}
