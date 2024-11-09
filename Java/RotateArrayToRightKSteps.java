// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/description/

// Time complexity : O(n)
// The method performs three separate reverse operations, each of which takes O(n) time in the worst case. Since these operations are sequential, the overall time complexity remains O(n).

// Space complexity : O(1)

public class RotateArrayToRightKSteps {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}