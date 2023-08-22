package org.example.arrays;

public class PrefixSumProblem3 {
    static int findEquilibriumIndex(int[] inputArray) {
        /*
        * Description - Equilibrium index of an array is an index such that the sum of elements at lower indexes is
        * equal to the sum of elements at higher indexes. We are given an Array of integers, We have to find out the first index i from left such that -
        A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]

        Input
        [-7, 1, 5, 2, -4, 3, 0]
        Output
        3
        A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
        * */
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
