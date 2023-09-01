import java.util.*;
public class SetMatrixZero {
	
	public static ArrayList<ArrayList<Integer>> zeromatrix(ArrayList<ArrayList<Integer>> matrix)
	{
		int m = matrix.size();
		int n = matrix.get(0).size();
		
		int col0 = 1;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix.get(i).get(j) == 0)
				{
					matrix.get(i).set(0,0);
					if(j != 0)
					{
						matrix.get(0).set(j,0);
					}
					else
					{
						col0 = 0;
					}
				}
			}
		}
		
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(matrix.get(i).get(j) != 0)
				{
					if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0)
					{
						matrix.get(i).set(j, 0);
					}
				}
			}
		}
		
		if(matrix.get(0).get(0) == 0)
		{
			for(int j=0;j<n;j++)
			{
				matrix.get(0).set(j,0);
			}
		}
		
		if(col0 == 0)
		{
			for(int i=0;i<m;i++)
			{
				matrix.get(i).set(0,0);
			}
		}
		
		return matrix;
	}
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ans = zeromatrix(matrix);
		System.out.println("The final matrix is: ");
		for(ArrayList<Integer> row:ans)
		{
			for(Integer ele:row)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
}
