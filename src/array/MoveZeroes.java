package array;

import java.util.Arrays;

/**
 * 2016/02/13
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
 * nums should be [1, 3, 12, 0, 0].
 *
 */
public class MoveZeroes
{

	public static void main(String[] args)
	{
		int array1[] = {1,0};
		int array2[] = {0,1,0};
		int array3[] = {0,0};
		int array4[] = {0, 1, 0, 3, 12,19};
		moveZeroes1(array4);
		

	}
	
	 public  static void moveZeroes1(int[] nums) 
	 {
         int zeroIndex = 0;
         for( int i = 0 ; i < nums.length ;i++)
         {
        	 if(nums[i] != 0)
        	 {
        		 nums[zeroIndex] = nums[i];
        		 zeroIndex++;
        	 }
         }
         for(;zeroIndex < nums.length;zeroIndex++)
         {
        	 nums[zeroIndex ] = 0;
         }
    		
         System.out.println(Arrays.toString(nums));
	 }
}
