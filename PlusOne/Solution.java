/*
 * Author: Thanh Ky Quan
 * Leetcode problem: Plus One
 * https://oj.leetcode.com/problems/plus-one/
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        int remember = 0;
        int length = digits.length - 1;
        int[] result;
        int i;
        digits[length] += 1;

        for (i=length; i>=0; i--) {
            digits[i] += remember;
            remember = digits[i] / 10;
            digits[i] %= 10;
        }
        if (remember > 0) {
            result = new int[length + 2];
            result[0] = 1;
            for (i=0; i<=length; i++) {
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}