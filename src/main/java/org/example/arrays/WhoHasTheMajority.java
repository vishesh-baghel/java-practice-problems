package org.example.arrays;

import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // input testcases

        while (t-- > 0) // Loop until we exhaust all testcases
        {
            int n = sc.nextInt(); // Input size of array n
            int arr[] = new int[n]; // Declaring the array
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x; // Assigning elements to array
            }

            int x = sc.nextInt(); // Input x
            int y = sc.nextInt(); // Input y

            Solution obj = new Solution(); // object to call the function
            System.out.println(
                    obj.majorityWins(arr, n, x, y)); // The functions you complete
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                counter++;
            }

            if (arr[i] == y) {
                counter--;
            }
        }

        if (counter > 0) {
            return x;
        } else if (counter == 0){
            return x > y ? y : x;
        } else {
            return y;
        }
    }
}
