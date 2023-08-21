package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrefixSumProblem2 {
 /*
 Description : We are given an Array of n integers, We are given q queries having indices l and r . We have to find out sum between the given range of indices.
Input 
[4, 5, 3, 2, 5]
3
0 3
2 4
1 3
Output
14 (4+5+3+2)
10 (3+2+5)
10 (5+3+2)

  */ 

  static int calculateSumInRange(int[] inputArray, int startIndex, int endIndex) {
    int sum = 0;
    for (int i = startIndex; i <= endIndex; i++) {
      sum += inputArray[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] inputArray = {4, 5, 3, 2, 5};
    List<List<Integer>> queryList = new ArrayList<>();
    List<Integer> query = new ArrayList<>();
    query.add(0);
    query.add(3);
    queryList.add(query);
    List<Integer> query2 = new ArrayList<>();
    query2.add(2);
    query2.add(4);
    queryList.add(query2);
    List<Integer> query3 = new ArrayList<>();
    query3.add(1);
    query3.add(3);
    queryList.add(query3);

    queryList.forEach(
            q -> {
            int sum;
            sum = calculateSumInRange(inputArray, q.get(0), q.get(1));
              System.out.println("The required sum is: " + sum);
            }
    );
    
  }
}
