package org.example.arrays;

public class PrefixSumProblem4 {
    /*
    Description : We are given an array of positive and negative integers. We have to find the subarray having maximum sum.
    Input
    [-3, 4, -1, -2, 1, 5]
    Output
    7
    (4+(-1)+(-2)+1+5)
    */

    static int findLargestSumSubArray(int[] inputArray) {
        int largestSum = 0;
        int currentSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            currentSum += inputArray[i];
            if (currentSum < 0 ) {
                currentSum = 0;
            }
            largestSum = Math.max(largestSum, currentSum);
        }

        return largestSum;
    }

    public static void main(String[] args) {
        int[] inputArray = {-3, 4, -1, -2, 1, 5};
        int maxSum = findLargestSumSubArray(inputArray);
        assert maxSum == 7 : "max sum you calculated is wrong";
        System.out.println("your calculated sum is : " + maxSum);
    }
}
