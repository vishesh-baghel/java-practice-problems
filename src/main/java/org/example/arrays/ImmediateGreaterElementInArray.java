package org.example.arrays;

public class ImmediateGreaterElementInArray {
    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 5, 6};
        int immediateSmaller = findImmediateGreaterElement(inputArray, 4);
        System.out.println("The immediate smaller element to 4 is 5 and you found: " + immediateSmaller);
    }

    private static int findImmediateGreaterElement(int[] inputArray, int elementToCheck) {
        int small = 1000;
        int present = -1;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > elementToCheck && small > inputArray[i]) {
                small = inputArray[i];
                present = small;
            }
        }
        return present;
    }
    // This is a method to print the array
    void print() {
        //write the code for this method
        System.out.println("This is a method to print the array");
    }
}
