package array;

import java.util.HashMap;

/**
 * 2016/02/03
 * Given an array of integers, find if the array contains any
 * duplicates. Your function should return true if any value appears at least
 * twice in the array, and it should return false if every element is distinct.
 * ��һ������鿴�Ƿ����ظ������� ����з���true ��֮
 */
public class ContainsDuplicate
{

	public static void main(String[] args)
	{
		int array[] = {};
		System.out.println(containsDuplicate(array));

	}

	public static boolean containsDuplicate(int[] nums)
	{
//		if(nums == null || nums.length == 0)
//		{
//			return false;
//		}
		HashMap map = new HashMap<Integer,Integer>();
		for(int num:nums)
		{
			if(map.containsKey(num))
			{
				return true;
			}
			else
			{
				map.put(num, 1);
			}
		}
		return false;

	}
}
