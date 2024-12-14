// 540. Single Element in a Sorted Array
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

// Approach : Binary Search

// Time complexity : O(log n), where n is the length of the array
// Space complexity : O(1), No additional data structures or auxiliary space are used.

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 2;
        int high = n - 3;

        if (n == 1)
            return nums[0];

        if (nums[0] != nums[1])
            return nums[0];

        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (nums[mid] == nums[mid - 1])
                mid--;

            if (mid % 2 == 0) {
                low = mid + 2;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}