import java.util.*;
public class CheckPalindrome {
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
	
	public static Node insert(Node head,int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head = newnode;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
		
		return head;
	}
	
	public static boolean IsPalindrome(Node head)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		while(head != null)
		{
			arr.add(head.data);
			head = head.next;
		}
		
		for(int i=0;i<arr.size()/2;i++)
		{
			if(arr.get(i) != arr.get(arr.size()-i-1)) return false;
		}
		return true;
	}
	
	public static Node Reverse(Node ptr)
	{
		Node prev = null;
		Node curr = ptr;
		Node nex = ptr;
		
		while(curr != null)
		{
			nex = nex.next;
			curr.next = prev;
			prev = curr;
			curr = nex;
		}
		
		return prev;
	}
	
	public static boolean IsPalindromeOpt(Node head)
	{
		if(head == null || head.next == null) return true;
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow.next = Reverse(slow.next);
		slow = slow.next;
		Node dummy = head;
		while(slow != null)
		{
			if(dummy.data != slow.data) return false;
			dummy = dummy.next;
			slow = slow.next;
		}
		
		return true;
	}
	
	public static void print(CheckPalindrome list)
	{
		Node curr = list.head;
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public static void main(String args[])
	{
		CheckPalindrome list = new CheckPalindrome();
		
		list.head = insert(list.head,1);
		list.head = insert(list.head,2);
		list.head = insert(list.head,2);
		list.head = insert(list.head,1);
		
		print(list);
		System.out.println(IsPalindromeOpt(list.head));
	}

}
