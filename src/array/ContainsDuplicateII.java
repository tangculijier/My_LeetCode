package array;

import java.util.HashMap;

/**
 * 2016/02/03
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j 
 * in the array such that nums[i] = nums[j] and the difference between 
 * i and j is at most k.
 * ����һ���������飬�жϸ��������Ƿ�������Ԫ��ֵ����ͬ�ģ�
 * �����ǵ�����ֵ������k�����򷵻�true�����򷵻�false
 *
 */
public class ContainsDuplicateII
{

	public static void main(String[] args)
	{
		int array[] = {1,0,1,1};
		System.out.println(containsNearbyDuplicate(array,1));

	}
	public static boolean containsNearbyDuplicate(int[] nums, int k)
	{
		if(nums == null || nums.length == 0)
		{
			return false;
		}
		HashMap map = new HashMap<Integer,Integer>();
		for(int i = 0 ;i < nums.length ;i++) 
		{
			if(map.containsKey(nums[i]))
			{
				if(i - (int)(map.get(nums[i])) <= k)
				{
					return true;
				}
			}

				map.put(nums[i], i);
		}
		return false;
	        
	}
}
