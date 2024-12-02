// 50. Pow(x, n)
// https://leetcode.com/problems/powx-n/

// Approach : Use recursive exponentiation by dividing the power into halves, leveraging the properties of even and odd powers to compute the result efficiently.

// Time complexity : O(log n)
// Space complexity : O(log n)

public class Power {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / myPowerHelper(x, n * -1);
        }
        return myPowerHelper(x, n);
    }

    public double myPowerHelper(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double halfPower = myPowerHelper(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
    }
}