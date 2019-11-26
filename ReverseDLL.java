package classDSQuestions;
import java.util.*;
public class ReverseDLL {
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
		}
	}
	static Node head;
	public static Node insert(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
			n.prev=null;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
			n.next=null;
		}
		System.out.println(data+" has been inserted");
		return head;
	}
	public static Node reverse(Node head){
		if(head==null)
			return head;
		if(head.next==null)
			return head;
		Node n=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return n;
	}
	public static void display(Node n1){
		Node temp=n1;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes you want to enter in doubly linked list:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		System.out.println("Enter data:");
		int d=sc.nextInt();
		insert(d);
		}
		System.out.println("Doubly Linked List before reversing:");
		display(head);
		Node n1=reverse(head);
		System.out.println("\nDoubly Linked List after reversing:");
		display(n1);
	}
}
