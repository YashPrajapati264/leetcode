package Java;

// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/description/

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
