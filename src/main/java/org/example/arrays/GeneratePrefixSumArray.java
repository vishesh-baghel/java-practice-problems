package org.example.arrays;

public class GeneratePrefixSumArray {

  static int[] generatePrefixSum(int[] inputArray) {
    int[] prefixSumArray = new int[inputArray.length];
    prefixSumArray[0] = inputArray[0];

    for (int i = 1; i < inputArray.length; i++) {
      prefixSumArray[i] = inputArray[i] + prefixSumArray[i - 1];
    }

    return prefixSumArray;
  }

  public static void main(String[] args) {
    int[] inputArray = {10, 20, 10, 5, 15};
    for (int i : inputArray) {
      System.out.println("original array: " + i);
    }
    int prefixSumArray[] = generatePrefixSum(inputArray);
    for (int i : prefixSumArray) {
      System.out.println("prefix sum array: " + i);
    }
    int[] expectedArray = {10, 30, 40, 45, 60};
    for (int i : expectedArray) {
      System.out.println("expected array: " + i);
    }
  }
}
