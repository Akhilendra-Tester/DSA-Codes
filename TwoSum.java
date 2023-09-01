import java.util.*;

public class TwoSum {

    public static int[] Solution1(int arr[],int target)
    {
        int [] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int needed = target - arr[i];
            if(mpp.containsKey(needed))
            {
                ans[0] = mpp.get(needed);
                ans[1] = i;
                return ans;
            }
            mpp.put(arr[i],i);
        }

        return ans;
    }

    public static boolean Solution2(int arr[],int target)
    {
        Arrays.sort(arr);
        int left = 0,right = arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right] == target)
            {
                return true;
            }
            else if(arr[left]+arr[right]<target)
            left++;
            else
            right--;
        }

        return false;
    }

    public static boolean BruteForce(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    return true;
                }
            }
        }        

        return false;
    }
    public static void main(String args[])
    {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        int[] ans = Solution1(arr,target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
