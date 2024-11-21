// 136. Single Number
// https://leetcode.com/problems/single-number/description/

// Time complexity : O(n), where n is the length of the array
// Space complexity : O(1), No additional data structures or auxiliary space are used.

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }

        return singleNumber;
    }
}
