package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * 2016/02/14
 * Given an array of n positive integers and a positive integer s, 
 * find the minimal length of a subarray of which the sum ≥ s. 
 * If there isn't one, return 0 instead.
 * For example, given the array [2,3,1,2,4,3] and s = 7,
 * the subarray [4,3] has the minimal length under the problem constraint.
 * 给一个数组 给一个s 找出数组中长度最短之合>=s，如果没有返回0
 */
public class Easy_MinimumSizeSubarraySum
{

	public static void main(String[] args)
	{
		int array1[] = {2,3,1,2,4,3};//s = 7
		int array2[] = {1,2,3,4,5};// s = 15
		System.out.println(minSubArrayLen(15,array2));

	}

	 public static int minSubArrayLen(int s, int[] nums) 
	 {
		 if(nums == null || nums.length == 0)
		 {
			 return 0;
		 }
		 Arrays.sort(nums);
		 int sum = 0;
		 for(int i = nums.length -1; i >= 0 ;i--)
		 {
			 System.out.println(nums[i]);
			 sum += nums[i];
			 if(sum >= s)
			 {
				 return nums.length - i;
			 }
		 }
		
		return 0;
	        
	 }
}
