package com.kremogen;

public class Recursion {
    public static String recursionNatural(int n) {
        if (n == 1) {
            return "1";
        }
        return recursionNatural(n - 1) + " " + n;
    }

    public static String recursionAB(int a, int b) {
        if (a > b) {
            return a + " " + recursionAB(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursionAB(a + 1, b);
        }
    }

    public static int recursionSum(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursionSum(n / 10);
        }
    }
}
