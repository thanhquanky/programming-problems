/*
 * Author: Thanh Ky Quan
 * Leetcode problem: Plus One
 * https://oj.leetcode.com/problems/plus-one/
 */
import org.junit.*;
public class TestSolution {
	
	@Test
	public void oneDigitTest() {
		int[] digits = {0};
		Solution sln = new Solution();
		int[] expected = {1};
		int[] actual = sln.plusOne(digits);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void manyDigitsTest() {
		int[] digits = {1,2,3,4,5,6,7,8};
		Solution sln = new Solution();
		int[] expected = {1,2,3,4,5,6,7,9};
		int[] actual = sln.plusOne(digits);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testWithRemember() {
		int[] digits = {1,2,3,4,5,6,7,9};
		Solution sln = new Solution();
		int[] expected = {1,2,3,4,5,6,8,0};
		int[] actual = sln.plusOne(digits);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testWithRememberLeadsToExtraDigit() {
		int[] digits = {9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		Solution sln = new Solution();
		int[] expected = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] actual = sln.plusOne(digits);
		Assert.assertArrayEquals(expected, actual);
	}
}
