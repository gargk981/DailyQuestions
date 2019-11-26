package classDSQuestions;
import java.util.*;
class Node1{
	int data;
	Node1 left,right;
	Node1(int d){
		data=d;
	}
}
public class BSTorNot {
	
	static Node1 root;
	BSTorNot(){
		root=null;
	}
	BSTorNot(int data)
	{
		root=new Node1(data);
	}
	static ArrayList<Integer> al=new ArrayList<Integer>();
	static void inOrder(Node1 root){
		if(root!=null){
			inOrder(root.left);
			al.add(root.data);
			inOrder(root.right);
		}
		return ;
	}
	public static boolean isBST(Node1 root){
		inOrder(root);
		int i=0;
		for(i=0;i<al.size()-1;i++){
			if(!(al.get(i)<=al.get(i+1)))
				break;
		}
		if(i==al.size()-1)
			return true;
		return false;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BSTorNot tree=new BSTorNot();
		tree.root=new Node1(6);
		tree.root.left=new Node1(4);
		tree.root.right=new Node1(7);
		tree.root.left.left=new Node1(3);
		tree.root.left.right=new Node1(5);
		if(isBST(root)==true)
			System.out.println("Is BST");
		else
			System.out.println("Not a BST");
	}
}
