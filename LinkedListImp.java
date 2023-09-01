public class LinkedListImp {
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
	
	public static LinkedListImp insert(LinkedListImp list,int data)
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
	
	public static void print(LinkedListImp list)
	{
		Node currnode = list.head;
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
	}
	
	public static void main(String args[])
	{
		LinkedListImp list = new LinkedListImp();
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		
		print(list);
	}
	
}
