package org.example.arrays;

public class SlidingWindowTechnique {
  //The technique is demostrated by solving the problem of calculating the max sum of k consecutive elements in a array

  static int calculateMaxSum(int[] array, int windowSize) {

    if (windowSize > array.length) {
      return -1;
    }

    int currentSum = 0;
    for (int i = 0; i < windowSize; i++) {
      currentSum += array[i];
    }
    System.out.println("current sum is: " + currentSum);

    int maxSum = currentSum;
    currentSum = 0;
    for (int i = windowSize; i < array.length; i++) {
      currentSum = currentSum + array[i] - array[i - windowSize];
      System.out.println("currentSum for " + i + " iteration is " + currentSum);
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }
  public static void main(String[] args ) {
    int[] array = {16,12,9,19,11,8};
    int sum = calculateMaxSum(array, 3);
    if (sum == 48) {
      System.out.println("The calculated sum:" + sum + "is same as 48");
    } else {
      System.out.println("You fucked up!! This is the actual sum: " + sum);
    }
  }
}
