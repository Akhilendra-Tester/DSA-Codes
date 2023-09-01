public class AddTwoNumbers {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(){}
		Node(int val){
			data = val;
			next = null;
		}
	};
	
	public static AddTwoNumbers insert(AddTwoNumbers list,int data)
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
	
	public static void print(AddTwoNumbers list)
	{
		Node currnode = list.head;
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
	}
	
	public static void Add(AddTwoNumbers list1,AddTwoNumbers list2)
	{
		AddTwoNumbers list3 = new AddTwoNumbers();
		
		Node start = new Node();
		Node temp = start;
		Node l1 = list1.head;
		Node l2 = list2.head;
		
		int carry = 0;
		
		while(l1 != null || l2 != null || carry==1)
		{
			int sum = 0;
			if(l1 != null)
			{
				sum += l1.data;
				l1 = l1.next;
			}
			
			if(l2 != null)
			{
				sum += l2.data;
				l2 = l2.next;
			}
			
			sum += carry;
			carry = sum/10;
			Node node = new Node(sum%10);
			temp.next = node;
			temp = temp.next;
		}
		
		list3.head = start.next;
		
		System.out.print("Added Linked List: ");
		Node currnode = list3.head;
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
	}
	
	public static void main(String args[])
	{
		AddTwoNumbers list1 = new AddTwoNumbers();
		AddTwoNumbers list2 = new AddTwoNumbers();
		
		list1 = insert(list1,2);
		list1 = insert(list1,4);
		list1 = insert(list1,3);
		
		list2 = insert(list2,5);
		list2 = insert(list2,6);
		list2 = insert(list2,4);
		
		print(list1);
		System.out.println();
		print(list2);
		System.out.println();
		Add(list1,list2);
	}

}
