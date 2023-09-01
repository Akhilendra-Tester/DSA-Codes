import java.util.*;
public class NumberofIslands {
	public static int NoofIslands(ArrayList<ArrayList<Integer>> grid)
	{
		int count = 0;
		
		
		return count;
	}
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<4;i++)
		{
			grid.add(new ArrayList<>());
		}
		grid.get(0).add(0,1);
		grid.get(0).add(1,1);
		grid.get(0).add(2,0);
		grid.get(0).add(3,0);
		grid.get(0).add(4,0);
		grid.get(1).add(0,1);
		grid.get(1).add(1,1);
		grid.get(1).add(2,0);
		grid.get(1).add(3,0);
		grid.get(1).add(4,0);
		grid.get(2).add(0,0);
		grid.get(2).add(1,0);
		grid.get(2).add(2,1);
		grid.get(2).add(3,0);
		grid.get(2).add(4,0);
		grid.get(3).add(0,0);
		grid.get(3).add(1,0);
		grid.get(3).add(2,0);
		grid.get(3).add(3,1);
		grid.get(3).add(4,1);
		
		System.out.println(NoofIslands(grid));
	}
}
