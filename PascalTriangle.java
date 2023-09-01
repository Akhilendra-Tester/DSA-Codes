import java.util.ArrayList;
public class PascalTriangle {
	public static ArrayList<Integer> GenerateRow(int row)
	{
		long ans = 1;
		ArrayList<Integer> ansRow = new ArrayList<>();
		ansRow.add(1);
		for(int col=1;col<row;col++)
		{
			ans = ans*(row-col);
			ans = ans/col;
			ansRow.add((int)ans); 
		}
		return ansRow;
	}
	
	//To find an element in nth row at cth column, the formula is :- (n-1)C(r-1)
	public static ArrayList<ArrayList<Integer>> Pascal(int n)
	{
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int row=1;row<=n;row++)
		{
			ans.add(GenerateRow(row));
		}
		return ans;
	}
	
	public static void main(String args[])
	{
		int n = 5;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ans = Pascal(n);
		for(ArrayList<Integer> row:ans)
		{
			for(Integer ele:row)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
	
//	Code to calculate NCr:-
//	for(int i=0;i<r;i++)
//	{
//		res = res*(n-i);
//		res = res/(i+1);
//	}
//	return res;
}
