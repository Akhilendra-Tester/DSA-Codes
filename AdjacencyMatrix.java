import java.util.*;
public class AdjacencyMatrix {
	int adj[][];
	int n;
	//Initialising the Matrix.
	public AdjacencyMatrix(int n)
	{
		this.n = n;
		adj = new int[n+1][n+1];
		
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<n+1;j++) {
				adj[i][j] = 0;
			}
		}
	}
	//Add Edge
	public void AddEdge(int i,int j)
	{
		adj[i][j] = 1;
		adj[j][i] = 1;
	}
	
	//Delete Edge
	public void DeleteEdge(int i,int j)
	{
		adj[i][j] = 0;
		adj[j][i] = 0;
	}
	
	public static void print(int[][] matrix)
	{
		int n = matrix.length;
		System.out.println("Adjacency Matrix: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		AdjacencyMatrix mat = new AdjacencyMatrix(5);
		mat.AddEdge(2,1);
		mat.AddEdge(1,3);
		mat.AddEdge(2,4);
		mat.AddEdge(3,4);
		mat.AddEdge(3,5);
		mat.AddEdge(4,5);
		print(mat.adj);
	}
}
