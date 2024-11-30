// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/description/

// Approach : Iterative

// Time complexity : O(n)
// Space complexity : O(1)

public class NthFibonnaciNumber {
    public int fib(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return a;
    }
}

// Approach : Naive Recursion

// Time complexity : O(2^n)
// Space complexity : O(n)

class NthFibonacciNumberRecursion {
    public int fib(int n) {
        return fibHelper(n);
    }

    public int fibHelper(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = fibHelper(n - 1);
        int b = fibHelper(n - 2);

        return a + b;
    }
}