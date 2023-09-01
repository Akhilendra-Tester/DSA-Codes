import java.util.*;

public class LongestConsecutiveSequence {

    public static int Solution1(int[] arr)
    {
        Arrays.sort(arr);
        int count = 1;

        if(arr.length == 0)
        return 0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1 == arr[i+1])
            {
                count++;
            }
        }
        return count;
    }

    public static int Solution2(int arr[])
    {
        HashSet<Integer> hashset = new HashSet<>();
        for(int num:arr)
        {
            hashset.add(num);
        }

        int longest = 0;

        for(int num:arr)
        {
            if(!hashset.contains(num-1))
            {
                int currentnum = num;
                int current = 1;

                while(hashset.contains(num+1))
                {
                    current+=1;
                    currentnum+=1;
                }
                longest = Math.max(longest,current);
            }
        }

        return longest;
    }
    public static void main(String args[])
    {
        int arr[] = {3,8,5,7,6};
        int count = Solution1(arr);

        System.out.println(count);
    }
}
