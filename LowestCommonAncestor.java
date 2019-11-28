package classDSQuestions;
import java.util.Scanner;
class Node2 {
	int data;
	Node2 left;
	Node2 right;

	Node2(int d) {
		data = d;
	}
}
public class LowestCommonAncestor {
	static Node2 root;
	LowestCommonAncestor()
	{
		root=null;
	}
	LowestCommonAncestor(int data)
	{
		root=new Node2(data);
	}
	public static Node2 LCA(Node2 root,int a,int b)
	{
		if(root==null||root.data==a|| root.data==b)
			return root;
		Node2 left=LCA(root.left,a,b);
		Node2 right=LCA(root.right,a,b);
		if(left!=null && right!=null)
		    return root;
		if(left!=null)
			return left;
		if(right!=null)
			return right;
		return null;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LowestCommonAncestor tree=new LowestCommonAncestor();
		tree.root=new Node2(1);
		tree.root.left=new Node2(2);
		tree.root.right=new Node2(3);
		tree.root.left.left=new Node2(4);
		tree.root.left.right=new Node2(5);
		tree.root.right.left=new Node2(6);
		tree.root.right.right=new Node2(7);
		System.out.println("Enter the nodes:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Node2 n=LCA(root,a,b);
		System.out.println("LCA of "+a+" and "+b+" is:"+n.data);
	}
}
