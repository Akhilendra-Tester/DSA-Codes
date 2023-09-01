import java.util.*;
public class AdjacencyList {
	public static void addedge(ArrayList<ArrayList<Integer>> list,int i,int j)
	{
		list.get(i).add(j);
		list.get(j).add(i);
	}
	
	public static void print(ArrayList<ArrayList<Integer>> list)
	{
		for(int i=1;i<list.size();i++)
		{
			System.out.print("Vertex:"+i+": ");
			for(int j=0;j<list.get(i).size();j++)
			{
				System.out.print("->"+list.get(i).get(j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int V = 6;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
			list.add(new ArrayList<Integer>());
		addedge(list,2,1);
		addedge(list,1,3);
		addedge(list,2,4);
		addedge(list,3,4);
		addedge(list,3,5);
		addedge(list,4,5);
		print(list);
	}
}
