import java.util.*;

public class SumofThree {
    public static ArrayList<ArrayList<Integer>> Solution1(int arr[])
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    if(arr[i]+arr[j]+arr[k] == 0)
                    {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                    }
                    if(temp.size()!=0)
                    {
                        res.add(temp);
                    }
                }
            }
        }

        return res;
    }

    public static ArrayList<ArrayList<Integer>> Solution2(int arr[])
    {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0;i<arr.length-2;i++)
        {
            int low = i+1;
            int hi = arr.length-1;
            int sum = 0-arr[i];

            while(low<hi)
            { 
                if(arr[low]+arr[hi] == sum)
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[low]);
                    temp.add(arr[hi]);
                    res.add(temp);

                    while(low<hi && arr[low] == arr[low+1]) low++;
                    while(low<hi && arr[hi] == arr[hi-1]) hi--;

                    low++;
                    hi--;
                }
                else if(arr[low] +arr[hi] < sum)
                low++;
                else
                hi--;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans = Solution2(arr);

        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}