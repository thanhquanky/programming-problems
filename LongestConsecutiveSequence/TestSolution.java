/*
 * Author: Thanh Ky Quan
 * Leetcode problem: Longest consecutive sequence
 * https://oj.leetcode.com/problems/longest-consecutive-sequence
 */
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestSolution {
	@Test (timeout = 10)
	public void testEmptyArray() {
		int[] num = {};
		Solution sln = new Solution();
		assertEquals(0, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 10)
	public void testOneElementArray() {
		int[] num = {1};
		Solution sln = new Solution();
		assertEquals(1, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 10)
	public void testConsecutiveElementsArray() {
		int[] num = {1,2,3,4};
		Solution sln = new Solution();
		assertEquals(4, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 10)
	public void testMixedOrderArray() {
		int[] num = {-1,1,3,4,2,6,5,0,11};
		Solution sln = new Solution();
		assertEquals(8, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 10)
	public void test2GroupInOrder() {
		int[] num = {1,2,3,7,8,9,10};
		Solution sln = new Solution();
		assertEquals(4, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 10)
	public void test2GroupsArray() {
		int[] num = {1,2,3,4};
		Solution sln = new Solution();
		assertEquals(4, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 10)
	public void testMediumSizeInputArray() {
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12, -13, -14, -15, -18, -17, -16};
		Solution sln = new Solution();
		assertEquals(37, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 50)
	public void testLargeSizeInputArray() {
		int[] num = generateInput(30000);
		Solution sln = new Solution();
		assertEquals(30000, sln.longestConsecutive(num));
	}
	
	@Test (timeout = 100)
	public void testVeryargeSizeInputArray() {
		int[] num = generateInput(500000);
		Solution sln = new Solution();
		assertEquals(500000, sln.longestConsecutive(num));
	}
	
	public int[] generateInput(int n) {
		int[] num = new int[n];
		for (int i=0; i<n; i++) 
			num[i] = i;
		return num;
	}
}
