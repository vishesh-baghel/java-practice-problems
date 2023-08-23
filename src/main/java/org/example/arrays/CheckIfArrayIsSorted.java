package org.example.arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] inputArray2 = {2, 3, 1, 3, 4};

        boolean isSortedHappyPath = checkIfArrayIsSorted(inputArray);
        boolean isSortedSadPath = checkIfArrayIsSorted(inputArray2);
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
}
