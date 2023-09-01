import java.util.*;
public class NextPermutation {
	public static List<Integer> NextPermutation(List<Integer> arr)
	{
		int n =arr.size();
		int ind = -1;
		
		for(int i=n-2;i>=0;i--)
		{
			if(arr.get(i) < arr.get(i+1))
			{
				ind = i;
				break;
			}
		}
		if(ind == -1)
		{
			Collections.reverse(arr);
			return arr;
		}
		
		for(int i=n-1;i>ind;i--)
		{
			if(arr.get(i) > arr.get(ind))
			{
				int temp = arr.get(i);
				arr.set(i,arr.get(ind));
				arr.set(ind,temp);
				break;
			}
		}
		
		List<Integer> sublist = arr.subList(ind+1, n);
		Collections.reverse(sublist);
		return arr;
	}
	
	public static void main(String args[])
	{
		List<Integer> A = Arrays.asList(new Integer[] {2,1,5,4,3,0,0});
		List<Integer> ans = NextPermutation(A);
		System.out.print("The next permutation is: [");
		 for (int i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i) + " ");
	        }
		System.out.println("]");
	}
}
