import java.util.*;
public class ThreeSumProblem {
	public static List<List<Integer>> triplet(int n,int[] arr)
	{
		Set<List<Integer>> st = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1;j<n;j++)
			{
				int third = -(arr[i] + arr[j]);
				if(hashset.contains(third)) {
					List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
					temp.sort(null);
					st.add(temp);
				}
				hashset.add(arr[j]);
			}
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}
	
	public static List<List<Integer>> tripletOpt(int n,int[] arr)
	{
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++)
		{
			if(i != 0 && arr[i] == arr[i-1]) continue;
			int j = i+1;
			int k = n-1;
			while(j<k)
			{
				int sum = arr[i] + arr[j] + arr[k];
				if(sum<0) j++;
				else if(sum>0) k--;
				else
				{
					List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
					ans.add(temp);
					j++;
					k--;	
					while(j<k && arr[j] == arr[j-1]) j++;
					while(j<k && arr[k] == arr[k-1]) k--;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String args[])
	{
		int arr[] = {-1,0,1,2,-1,-4};
		int n = arr.length;
		List<List<Integer>> ans = tripletOpt(n,arr);
		for(List<Integer> it:ans) {
			System.out.print("[");
			for(Integer i:it) {
				System.out.print(i+" ");
			}
			System.out.print("]");
		}
		System.out.println();
	}
}
