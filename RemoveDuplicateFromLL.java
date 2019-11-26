import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class RemoveDuplicateFromLL
{
	static Node head;
	public static Node insert(int d){
		Node n=new Node(d);
		if(head==null)
			head=n;
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
			n.next=null;
		}
		//System.out.println(d+" has insrted");
		return head;
	}
	public static Node removeDup(Node head){
	    Node temp=head;
	    while(temp.next!=null){
	        Node temp1=temp.next;
	        while(temp1!=null){
	            if(temp.data==temp1.data){
	            temp1.data=0;
	            }
	            temp1=temp1.next;
	        }
	        temp=temp.next;
	    }
	    return head;
	}
	public static void display(Node head){
	    Node temp=head;
	    while(temp!=null){
	        if(temp.data!=0)
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements you want to enter in linked list:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("Enter data: ");
			int m=sc.nextInt();
			head=insert(m);
		}
		head=removeDup(head);
		display(head);
	}
}
