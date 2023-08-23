package org.example.arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] inputArray2 = {2, 3, 1, 3, 4};

        boolean isSortedHappyPath = checkIfArrayIsSortedUsingRecursion(inputArray, inputArray.length);
        boolean isSortedSadPath = checkIfArrayIsSortedUsingRecursion(inputArray2, inputArray2.length);
        System.out.println("expected array is sorted, and you found that the array is " + (isSortedHappyPath ? "sorted": "not sorted"));
        System.out.println("expected array is not sorted, and you found that the array is " + (isSortedSadPath ? "sorted": "not sorted"));
    }

    private static boolean checkIfArrayIsSorted(int[] inputArray) {
        int arrayIndex = 1;
        while(arrayIndex < inputArray.length) {
            if (inputArray[arrayIndex - 1] >= inputArray[arrayIndex]) {
                return false;
            }
            arrayIndex++;
        }

        return true;
    }

    private static boolean checkIfArrayIsSortedUsingRecursion(int[] inputArray, int size) {
       if (size == 1 || size == 0) return true;
       if (inputArray[size - 1] < inputArray[size - 2]) return false;
       return checkIfArrayIsSortedUsingRecursion(inputArray, size - 1);
    }
}
