package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 2016/02/12
 * Given a sorted integer array without duplicates, 
 * return the summary of its ranges.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 *
 */
public class Easy_SummaryRanges
{

	public static void main(String[] args)
	{
		int[] arr = {0,1,2,4,5,7,11};
		List<String> result = summaryRanges(arr);
		for(String s :result)
		{
			System.out.println(s);
		}
	}

	public static List<String> summaryRanges(int[] nums)
	{
		
		List<String> result = new ArrayList<String>();
		if(nums==null || nums.length<1) return  result;
		int start = 0;
		int end = 0;
		for(int i = 0 ;i < nums.length  ; i++)
		{
			if( i + 1 < nums.length && nums[i+1] - nums[i] == 1 )
			{
			}
			else
			{
				end = i;
				if(end == start )
				{
					result.add(nums[start]+"");
				}
				else
				{
					result.add(nums[start]+"->"+nums[end]);
				}
					
				start = i + 1;
				
			}
		}
		return result;
        
    }

}
