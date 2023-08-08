package org.example;

public class getNthTermInAP {
    static void print(int firstTerm, int commonDifference, int numberOfTerms) {
        int nthTerm = firstTerm + (numberOfTerms - 1) * commonDifference;
        System.out.println(nthTerm);
    }
}
