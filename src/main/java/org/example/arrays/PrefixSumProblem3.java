package org.example.arrays;

public class PrefixSumProblem3 {
    static int findEquilibriumIndex(int[] inputArray) {
       if (inputArray.length < 3) {
           return -1;
       }
       int assumedIndex = 1;
       while(true) {
           int leftPrefixSum = calculatePrefixSum(inputArray, 0, assumedIndex);
           int rightPrefixSum = calculatePrefixSum(inputArray, assumedIndex, inputArray.length - 1);
           if (leftPrefixSum == rightPrefixSum) {
               return assumedIndex;
           } else {
               assumedIndex++;
           }
       }
    }

    static int calculatePrefixSum(int[] inputArray, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] inputArray = {-7, 1, 5, 2, -4, 3, 0};
        int foundIndex = findEquilibriumIndex(inputArray);
        System.out.println("expected output index is 3 and you found: " + foundIndex);
    }
}
