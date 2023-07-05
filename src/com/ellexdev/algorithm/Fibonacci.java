package com.ellexdev.algorithm;

/**
 * @author Alex Pupyshev 2023-07-05
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibSlow(3));
        System.out.println(fibSlow(5));
        System.out.println(fibSlow(10));

        int n = 100;
        long[] mem = new long[n + 1];
        System.out.println(fibFastRecursion(n, mem));

        System.out.println(fibFast(10));
        System.out.println(fibFast(100));
    }

    private static long fibSlow(int n) {
        if (n <= 1) {
            return n;
        }
        return fibSlow(n - 1) + fibSlow(n - 2);
    }

    private static long fibFastRecursion(int n, long[] mem) {
        if (n <= 1) {
            return n;
        } else if (mem[n] != 0) {
            return mem[n];
        }

        long res = fibFastRecursion(n - 1, mem) + fibFastRecursion(n - 2, mem);
        mem[n] = res;

        return res;
    }

    private static long fibFast(int n) {
        if (n <= 1) {
            return n;
        }
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (var i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
