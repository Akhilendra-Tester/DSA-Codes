import java.util.*;
public class DepthFirstSearch {
	public static void Recur(int node,boolean vis[],ArrayList<ArrayList<Integer>> list, ArrayList<Integer> dfs)
	{
		vis[node] = true;
		dfs.add(node);
		
		for(Integer it:list.get(node))
		{
			if(vis[it] == false)
			{
				Recur(it,vis,list,dfs);
			}
		}
	}
	
	public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> list,int V)
	{
		ArrayList<Integer> dfs = new ArrayList<Integer>();
		boolean vis[] = new boolean[V];
		vis[1] = true;
		Recur(1,vis,list,dfs);
		return dfs;
	}
	
	public static void addedge(ArrayList<ArrayList<Integer>> list,int i,int j)
	{
		list.get(i).add(j);
		list.get(j).add(i);
	}
	
	public static void main(String args[])
	{
		int V = 10;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		addedge(list,1,2);
		addedge(list,1,3);
		addedge(list,2,5);
		addedge(list,2,6);
		addedge(list,3,4);
		addedge(list,3,7);
		addedge(list,4,8);
		addedge(list,7,8);
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		ArrayList<Integer> ans = dfs.DFS(list, V);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}
