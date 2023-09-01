public class RotateList {
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
	
	public static RotateList insert(RotateList list,int data)
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
	
	public static Node RotateList(Node head,int k)
	{
		if(head == null || head.next == null) return head;
		for(int i=0;i<k;i++)
		{
			Node temp = head;
			while(temp.next.next != null) temp = temp.next;
			Node end = temp.next;
			temp.next = null;
			end.next = head;
			head = end;
		}
		
		return head;
	}
	
	public static Node RotateListOpt(Node head,int k)
	{
		if(head == null || head.next == null) return head;
		Node temp = head;
		int length = Length(head);
		while(temp.next != null) temp = temp.next;
		temp.next = head;
		k = k % length;
		int end = length - k;
		
		while(end-- != 0) temp = temp.next;
		head = temp.next;
		temp.next = null;
		return head;
	}
	
	public static void print(RotateList list)
	{
		Node currnode = list.head;
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
	}
	
	public static int Length(Node head)
	{
		Node temp = head;
		int count = 0;
		
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String args[])
	{
		RotateList list = new RotateList();
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		print(list);
		list.head = RotateListOpt(list.head,2);
		System.out.println();
		print(list);
	}
}
