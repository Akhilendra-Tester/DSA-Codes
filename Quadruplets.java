import java.util.ArrayList;
import java.util.Arrays;

public class Quadruplets {

    public static ArrayList<ArrayList<Integer>> SumofFour(int[] arr,int target)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length-3;i++)
        {
            for(int j=i+1;j<arr.length-2;j++)
            {
                int low = j+1;
                int high = arr.length-1;

                while(low<high)
                {
                    if(arr[i]+arr[j]+arr[low]+arr[high] == target)
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);
                        res.add(temp);

                        while(low<high && arr[low] == arr[low+1]) low++;
                        while(low<high && arr[high] == arr[high-1]) high--;

                        low++;
                        high--;
                    }
                    else if(arr[i]+arr[j]+arr[low]+arr[high] <= target)
                    low++;
                    else
                    high--;
                }
            }
        }

        return res;
    }
    public static void main(String args[])
    {
        int[] arr = {4,3,3,4,4,2,1,2,1,1};
        int target = 9;
        ArrayList<ArrayList<Integer>> ans = SumofFour(arr, target);
        // for(int i=0;i<ans.size();i++)
        // {
        //     for(int j=0;j<ans.get(i).size();i++)
        //     {
        //         System.out.print(ans.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
        for (ArrayList<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
