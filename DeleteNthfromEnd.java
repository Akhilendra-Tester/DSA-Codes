public class DeleteNthfromEnd {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int val)
		{
			data = val;
			next = null;
		}
	};
	
	public static DeleteNthfromEnd insert(DeleteNthfromEnd list,int data)
	{
		Node newnode = new Node(data);
		if(list.head == null)
		{
			list.head = newnode;
		}
		else
		{
			Node temp = list.head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
		
		return list;
	}
	
	public static void print(DeleteNthfromEnd list)
	{
		Node currnode = list.head;
		System.out.print("Intial Linked List: ");
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
	}
	
	public static void delete(DeleteNthfromEnd list,int N)
	{
		Node start = new Node(0);
		start.next = list.head;
		Node slow = start.next;
		Node fast = start.next;
		
		for(int i=0;i<N;i++)
		{
			fast = fast.next;
		}
		
		while(fast.next != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		
		Node currnode = list.head;
		System.out.print("Final Linked List: ");
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
		
	}
	
	public static void main(String args[])
	{
		DeleteNthfromEnd list = new DeleteNthfromEnd();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,5);
		list = insert(list,6);
		
		print(list);
		System.out.println();
		delete(list,3);
	}
}
