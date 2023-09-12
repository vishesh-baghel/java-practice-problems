package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class ImmediateSmallerInArray {

    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 5, 6};
        int immediateSmaller = findImmediateSmallerElement(inputArray, 4);
        System.out.println("The immediate smaller element to 4 is 3 and you found: " + immediateSmaller);
    }

    private static int findImmediateSmallerElement(int[] inputArray, int elementToCheck) {
        int immediateSmaller = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < elementToCheck && inputArray[i] > immediateSmaller) {
                immediateSmaller = inputArray[i];
            }
        }
        return immediateSmaller;
    }
}
