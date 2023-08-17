package org.example.arrays;

public class PrefixSumProblem1 {
  /*
   * Problem statement: Consider an array of size N with all initial values as 0. Perform given 'm' add operations from index 'a' to 'b' and evaluate highest element in array. An add operation adds 100 to all elements from index a to b (both inclusive).
   * 
   * Input : n = 5 // We consider array {0, 0, 0, 0, 0}
        m = 3.
        a = 2, b = 4.
        a = 1, b = 3.
        a = 1, b = 2.
    Output : 300

    Explanation : 
    After I operation -
    A : 0 100 100 100 0

    After II operation -
    A : 100 200 200 100 0

    After III operation -
    A : 200 300 200 100 0

    Highest element : 300
   */

   static int[] performAddOperations(int[] inputArray, int startIndex, int endIndex, int requiredValueToAdd) {
    int[] prefixSumArray = new int[inputArray.length];
    prefixSumArray[0] = inputArray[0];
    prefixSumArray[startIndex - 1] += 100;
    prefixSumArray[endIndex - 1] -= 100;

    for(int i = 1; i < inputArray.length; i++) {
      prefixSumArray[i] = inputArray[i] + inputArray[i - 1];
    }

    for(int i = 1; i < inputArray.length; i++) {
      prefixSumArray[i] = inputArray[i] + inputArray[i - 1];
    }


    return prefixSumArray;
   }

   public static void main(String[] args) {
    int[] inputArray = {0, 0, 0, 0, 0};
    int requiredValueToAdd = 100;
    int[] result = new int[inputArray.length];

    result = performAddOperations(inputArray, 2, 4, requiredValueToAdd);
    result = performAddOperations(inputArray, 1, 3, requiredValueToAdd);
    result = performAddOperations(inputArray, 1, 2, requiredValueToAdd);

    for (int i : result) {
      System.out.println("your result : " + i);
    }
    int[] expectedArray = {200, 300, 300, 100, 0};
    for (int i : expectedArray) {
      System.out.println("expected array : " + i);
    }
    
   }
}
