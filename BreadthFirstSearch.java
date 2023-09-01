import java.util.*;
public class BreadthFirstSearch {
	public static void addedge(ArrayList<ArrayList<Integer>> list,int i,int j)
	{
		list.get(i).add(j);
		list.get(j).add(i);
	}
	
	public static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> list,int V)
	{
		ArrayList<Integer> bfs = new ArrayList<>();
		boolean vis[] = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		vis[1] = true;
		
		while(!q.isEmpty())
		{
			int node = q.poll();
			bfs.add(node);
			
			for(int it: list.get(node)) {
				if(vis[it] == false) {
					vis[it] = true;
					q.add(it);
				}
			}
		}
		return bfs;
	}
	
	public static void main(String args[])
	{
		int V = 10;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++) {
			list.add(new ArrayList<Integer>());
		}
		addedge(list,1,2);
		addedge(list,1,6);
		addedge(list,2,3);
		addedge(list,2,4);
		addedge(list,6,7);
		addedge(list,6,9);
		addedge(list,4,5);
		addedge(list,7,8);
		addedge(list,5,8);
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		ArrayList<Integer> ans = bfs.BFS(list, V);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}
	}

}
