import java.util.*;
public class RandomPointerLL {
	Node head;
	static class Node {
		int data;
		Node next;
		Node random;	
		Node(int val)
		{
			data = val;
			next = null;
			random = null;
		}
	}
	
	public static Node copyRandomList(Node head)
	{
		HashMap <Node,Node> hashmap = new HashMap<>();
		Node temp = head;
		while(temp != null)
		{
			Node newnode = new Node(temp.data);
			hashmap.put(temp,newnode);
			temp = temp.next;
		}
		
		Node t = head;
		while(t!=null)
		{
			Node node = hashmap.get(t);
			node.next = (t.next != null)?hashmap.get(t.next):null;
			node.random = (t.random != null)?hashmap.get(t.random):null;
			t = t.next;
		}
		return hashmap.get(head);
	}
	
	public static Node copyRandomListOpt(Node head)
	{
		if(head ==  null) return null;
		Node iter = head;
		
		 // Duplicate each node and insert it next to the original node
		while(iter != null)
		{
			Node newnode = new Node(iter.data);
			newnode.next = iter.next;
			iter.next = newnode;
			iter = newnode.next;
		}
		iter = head;
		
		// Set random pointers for the copied nodes
		while(iter != null)
		{
			if(iter.random != null)
			{
				iter.next.random = iter.random.next;
			}
			iter = iter.next.next;
		}
		iter = head;
		Node pseudo = new Node(0);
		Node copy = pseudo;
		Node front;
		
		// Separate the original and copied linked lists
		while(iter != null)
		{
			front = iter.next.next;
			copy.next = iter.next;
			iter.next = front;
			copy = copy.next;
			iter = iter.next;
		}
		return pseudo.next;
	}
	
	static void printList(Node head) {
	    while(head != null) {
	        System.out.print(head.data+":");
	        if(head.next != null)
	        System.out.print(head.next.data);
	        else
	        System.out.print("NULL");
	        if(head.random != null)
	        System.out.print(","+head.random.data);
	        else
	        System.out.print(",NULL");
	        System.out.println();
	        head = head.next;
	    }
	}

	public static void main(String args[]) {
	    Node head = null;
	    Node node1 = new Node(1);
	    Node node2 = new Node(2);
	    Node node3 = new Node(3);
	    Node node4 = new Node(4);
	    head = node1;
	    head.next = node2;
	    head.next.next = node3;
	    head.next.next.next = node4;
	    head.random = node4;
	    head.next.random = node1;
	    head.next.next.random = null;
	    head.next.next.next.random = node2;
	    
	    printList(head);
	    System.out.println();
	    Node newHead = copyRandomListOpt(head);
	    printList(newHead);
	}
}
