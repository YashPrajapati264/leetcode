// 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

// Approach : Extract and compute product and sum of digits.

// Time complexity : O(d) , where d = number of digits in the integer n
// Space complexity : O(1)

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }

        return product - sum;
    }
}