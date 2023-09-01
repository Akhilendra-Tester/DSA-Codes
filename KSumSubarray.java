import java.util.*;
public class KSumSubarray{
    public static int Solution1(int[] arr,int target)
    {
        int max = 0;

        for(int i=0;i<arr.length-1;i++)
        {
            int sum = 0;
            for(int j=i;j<arr.length;j++)
            {
                sum += arr[j];
                if(sum == target)
                {
                    max = Math.max(max,j-i+1);
                }
            }
        }

        return max;
    }

    public static int Solution2(int[] arr,int target)
    {
    	HashMap <Integer,Integer> mpp = new HashMap<>();
    	
    	int sum = 0;
        int max = 0;
        
        for(int i=0;i<arr.length;i++)
        {
        	sum += arr[i];
        	
        	if(sum == 0)
        	{
        		max = i+1;
        	}
        	else if(mpp.get(sum) != null)
        	{
        		max = Math.max(max, i-mpp.get(sum));
        	}
        	else
        	{
        		mpp.put(sum,i);
        	}
        }
        
        return max;
    }

    public static void main(String args[])
    {
        int[] arr = {9,-3,3,-1,6,-5};
        int target = 0;
        int ans = Solution1(arr,target);
        System.out.println(ans);
    }
}