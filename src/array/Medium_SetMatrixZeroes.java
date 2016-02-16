package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 2016/02/16
 * Given a m x n matrix, 
 * if an element is 0, set its entire row and column to 0. Do it in place.
 * 给一个 m * n数组如果有一个元素为0 那么把它所在的列与行全部至为0  
 */
public class Medium_SetMatrixZeroes
{

	public static void main(String[] args)
	{
		
		//test
		int array1[][] ={ {1,0,3,4,5},{5,2,0,7,8},{1,1,2,3,4},{5,9,6,7,8}};
		int array2[][] ={ {0}};

		printArray(array1);
		setZeroes2(array1);
		System.out.println("----------");
		printArray(array1);
	}

	 public static void setZeroes(int[][] matrix) 
	 {
		 int m = matrix.length;
		 int n = matrix[0].length;
		 List<int[]> zeroPoint = new ArrayList<int[]>();
		 for(int i = 0 ; i< m;i++)
		 {
			for(int j = 0 ; j < n;j++)
			{
				if(matrix[i][j] == 0)
				{
					int[] point = {i,j};
					zeroPoint.add(point);

				}
			}
		 }
		 
		 for (int[] point:zeroPoint)
		 {  
				int tempn = n;
				int tempm = m;
				while(tempn > 0)
				{
					matrix[point[0]][--tempn] = 0;
				}
				while(tempm > 0)
				{
					matrix[--tempm][point[1]] = 0;
				}
				
	           // System.out.println("i = " + point[0] + "  j = " + point[1]);  
	        }  
	 }
	 
	 public static void setZeroes2(int[][] matrix) 
	 {
		 int m = matrix.length;//row
		 int n = matrix[0].length;//column
		 boolean firstRowContainsZero = false;
		 boolean firstColumnContainsZero = false;
		 for(int i = 0 ;i < n ;i++)
		 {
			 if( matrix[0][i] == 0 )
			 {
				 firstRowContainsZero  = true;
				 break;
			 }
		 }
		 for(int j = 0 ;j < m ;j++)
		 {
			 if( matrix[j][0] == 0 )
			 {
				 firstColumnContainsZero  = true;
				 break;
			 }
		 }
		 for(int i = 1 ; i< m;i++)
		 {
			for(int j = 1 ; j < n;j++)
			{
				if(matrix[i][j] == 0)
				{
					matrix[0][j] = 0;
					matrix[i][0] = 0;

				}
			}
		 }
		 
		 for(int i = 1 ; i< m;i++)
		 {
			for(int j = 1 ; j < n;j++)
			{
				if(matrix[0][j] == 0 ||matrix[i][0] == 0)
				{
					matrix[i][j] = 0;

				}
			}
		 }
		 if(firstColumnContainsZero == true)
		 {
			 for(int i = 0 ; i < m;i++)
			 {
				 matrix[i][0] = 0;
			 }
		 }
		 
		 if(firstRowContainsZero)
		 {  
            for(int j = 0; j < n; ++j)  
            {
            	 matrix[0][j] = 0;  
            }
	               
	      }  
		 
	 }
	 
	 
	 private static void printArray(int[][] array1)
	 {
		 for(int i = 0 ; i< array1.length;i++)
			{
				for(int j = 0 ; j < array1[i].length;j++)
				{
					System.out.print(array1[i][j]+" ");
				}
				System.out.println();
			}
	 }
}
