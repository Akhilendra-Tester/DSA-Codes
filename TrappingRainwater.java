import java.util.*;
public class TrappingRainwater {
	public static int trapping(int[] arr)
	{
		int n = arr.length;
		int pre[] = new int[n];
		int suff[] = new int[n];
		pre[0] = arr[0];
		for(int i=1;i<n;i++)
		{
			pre[i] = Math.max(pre[i-1],arr[i]);
		}
		suff[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			suff[i] = Math.max(suff[i+1], arr[i]);
		}
		int trapped = 0;
		for(int i=0;i<n;i++)
		{
			trapped += Math.min(pre[i],suff[i]) - arr[i];
		}
		
		return trapped;
	}
	
	public static int trappingOpt(int[] arr)
	{
		int n = arr.length;
		int res = 0;
		int leftmax = 0;
		int rightmax = 0;
		int left = 0;
		int right = n-1;
		
		while(left <= right)
		{
			if(arr[left] <= arr[right])
			{
				if(arr[left] >= leftmax) leftmax = arr[left];
				else res += leftmax-arr[left];
				left++;
			}
			else
			{
				if(arr[right] >= rightmax) rightmax = arr[right];
				else res += rightmax - arr[right];
				right--;
			}
		}
		return res;
	}
	
	public static void main(String args[])
	{
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappingOpt(arr));
	}
}
