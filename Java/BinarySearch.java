// 704. Binary Search
// https://leetcode.com/problems/binary-search/description/

// Approach : Binary Search

// Time complexity : O(log n), where n is the length of the array
// Space complexity : O(1), No additional data structures or auxiliary space are used.

public class BinarySearch {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}