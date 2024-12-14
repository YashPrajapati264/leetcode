// 69. Sqrt(x)
// https://leetcode.com/problems/sqrtx/description/

// Approach : Binary Search

// Time complexity : O(log x), where x is an integer
// Space complexity : O(1), No additional data structures or auxiliary space are used.

public class Sqrt {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int answer = Integer.MIN_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            if (square < x) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }
}
