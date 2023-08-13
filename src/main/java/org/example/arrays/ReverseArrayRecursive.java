package org.example.arrays;

public class ReverseArrayRecursive {

  static void reverse(int[] array, int startingIndex, int endingIndex) {
    if (startingIndex >= endingIndex) {
      return;
    }
    int temp = array[0];
    int start = array[array.length - 1];
    int end = temp;

    reverse(array, start, end);
  }

  void print(int[] array) {
    for (int i : array) {
      System.out.println(i + " ");
    }
  }
  
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    reverse(arr, 0, arr.length - 1);
  }
}

showed up
