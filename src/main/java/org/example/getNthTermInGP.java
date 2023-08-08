package org.example;

public class getNthTermInGP {
    static void print(String[] args) {
        int firstTerm = Integer.parseInt(args[0]);
        int commonRatio = Integer.parseInt(args[1]);
        int numberOfTerms = Integer.parseInt(args[2]);
        int nThTerm = firstTerm * (int)Math.pow(commonRatio, (numberOfTerms - 1));
        System.out.println(nThTerm);
    }
}
