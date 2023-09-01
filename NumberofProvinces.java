import java.util.*;
public class NumberofProvinces {
	public static void DFS(int node,ArrayList<ArrayList<Integer>> list,boolean vis[])
	{
		vis[node] = true;
		for(int it:list.get(node))
		{
			if(vis[it] == false)
			{
				DFS(it,list,vis);
			}
		}
	}
	
	public static void DepthFirstSearch(ArrayList<ArrayList<Integer>> list,int i,boolean vis[])
	{
		vis[i] = true;
		DFS(i,list,vis);
		
	}
	public static void addedge(ArrayList<ArrayList<Integer>> list,int i,int j)
	{
		list.get(i).add(j);
		list.get(j).add(i);
	}
	
	public static int NoofProvinces(ArrayList<ArrayList<Integer>> list,int V)
	{
		int count = 0;
		boolean vis[] = new boolean[V];
		for(int i=0;i<V;i++)
		{
			vis[i] = false;
		}
		for(int i=1;i<=V-1;i++)
		{
			if(vis[i] == false)
			{
				DepthFirstSearch(list,i,vis);
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		int V = 9;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			list.add(new ArrayList<Integer>());
		}
		addedge(list,1,2);
		addedge(list,2,3);
		addedge(list,4,5);
		addedge(list,5,6);
		addedge(list,7,8);
		System.out.println(NoofProvinces(list,V));
	}
}
