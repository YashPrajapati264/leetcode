// 344. Reverse String
// https://leetcode.com/problems/reverse-string/description/

// Approach : Two Pointer

// Time complexity : O(n), where n is the length of the array
// Space complexity : O(1), No additional data structures or auxiliary space are used.

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
