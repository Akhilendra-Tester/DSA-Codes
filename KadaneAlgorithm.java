import java.util.*;
public class KadaneAlgorithm {
	public static long Kadane(int[] arr)
	{
		long ans = Long.MIN_VALUE;
		int n = arr.length;
		long sum = 0;
		
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
			if(sum>ans)
			{
				ans = sum;
			}
			
			if(sum<0)
			{
				sum = 0;
			}
		}
		return ans;
	}
	
	public static void main(String args[])
	{
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		long maxSum = Kadane(arr);
		System.out.println(maxSum);
	}

}
