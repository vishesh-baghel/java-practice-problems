package org.example.arrays;

class WhoHasTheMajority {
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
