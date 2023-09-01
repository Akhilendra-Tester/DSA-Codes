import java.util.*;
public class CountReversePairs{
    private static void merge(int[]nums,int low,int high,int mid)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                temp.add(nums[left]);
                left++;
            }
            else
            {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid)
        {
            temp.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i] = temp.get(i-low);
        }

    }

    public static int CountPairs(int nums[],int low,int mid,int high)
    {
        int count = 0;
        int right = mid+1;

        for(int i=low;i<=mid;i++)
        {
            while(right<=high && nums[i] > 2*nums[right])
            {
                right++;
            }
            count += (right-(mid+1));
        }      
        return count;
    }

    public static int mergeSort(int nums[],int low,int high)
    {
        int count = 0;
        if(low>=high)
        return count;
        int mid = (low+high)/2;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums,mid+1,high);
        count += CountPairs(nums,low,mid,high);
        merge(nums,low,high,mid);

        return count;
    }

    public static int team(int nums[])
    {
        int count  = mergeSort(nums,0,nums.length-1);
        return count;
    }
    
    public static void main(String args[])
    {
        int nums[] = {2,4,3,5,1};
        int ans = team(nums);

        System.out.println(ans);
    }
}