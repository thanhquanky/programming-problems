/*
 * Author: Thanh Ky Quan
 * Leetcode problem: Longest consecutive sequence
 * https://oj.leetcode.com/problems/longest-consecutive-sequence
 */
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public int longestConsecutive(int[] num) {
        int i, j;
        HashSet<Integer> set = new HashSet<Integer>();
        for (i=0; i<num.length; i++) {
            set.add(num[i]);
        }
        int[] delta = {-1, 1};
        int maxLength = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
        	int current = iterator.next();
            int length = 1;
            set.remove(current);
            for (j=0; j<2; j++) {
                int next = current + delta[j];
                while (set.contains(next)) {
                    length++;
                    set.remove(next);
                    next += delta[j];
                }    
            }
            if (length > maxLength) {
                maxLength = length;
            }
            iterator = set.iterator();
        }
        return maxLength;
    }
}