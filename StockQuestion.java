import java.util.*;
public class StockQuestion {
	public static int MaxPro(int[] arr)
	{
		int minprice = Integer.MAX_VALUE;
		int maxpro = 0;
		for(int i=0;i<arr.length;i++)
		{
			minprice = Math.min(minprice, arr[i]);
			maxpro = Math.max(maxpro,arr[i] - minprice);
		}
		return maxpro;
	}
	public static void main(String args[])
	{
		int arr[] = {7,1,5,3,6,4};
		int profit = MaxPro(arr);
		System.out.println(profit);
	}
}
