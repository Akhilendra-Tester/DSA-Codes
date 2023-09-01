public class ReverseKNodes {
	Node head;
	static class Node {
		int data;
		Node next;
		
		Node(int val)
		{
			data = val;
			next = null;
		}
	};
	
	public static Node insert(Node head,int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
		}
		
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		return head;
	}
	
	public static void print(ReverseKNodes list)
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
		int length = 0;
		while(head != null)
		{
			length++;
			head = head.next;
		}
		return length;
	}
	
	public static Node Reverse(Node head,int k)
	{
		if(head == null || head.next == null || k == 1) return head;
		int length = Length(head);
		
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;
		Node curr = dummy;
		Node nex = dummy;
		
		while(length >= k)
		{
			curr = prev.next;
			nex = curr.next;
			for(int i=1;i<k;i++)
			{
				curr.next = nex.next;
				nex.next = prev.next;
				prev.next = nex;
				nex = curr.next;
			}
			prev = curr;
			length -= k;
		}
		
		return dummy.next;
	}
	
	public static void main(String args[])
	{
		ReverseKNodes list = new ReverseKNodes();

		list.head = insert(list.head, 1);
		list.head = insert(list.head, 2);
		list.head = insert(list.head, 3);
		list.head = insert(list.head, 4);
		list.head = insert(list.head, 5);
		list.head = insert(list.head, 6);
		list.head = insert(list.head, 7);
		list.head = insert(list.head, 8);
		print(list);
		list.head = Reverse(list.head,3);
		System.out.println();
		print(list);
	}
	
}
