import java.util.*;
class Node
{
	public int data;
	public Node left;
	public Node right;
	public void displayNode()
	{
		System.out.print(data+" ");
	}
}
class BTree
{
	private Node root;
	BTree()
	{
		root = null;
	}
	public void insert(int value)
	{
		Node newNode = new Node();
		newNode.data = value;
		if(root==null)
			root = newNode;
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				if(value < current.data)
				{
					current = current.left;
					if(current == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else
				{
					current = current.right;
					if(current == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	public Node getRoot()
	{
		return root;
	}
	public void preOrder(Node root)
	{
		if(root != null)
		{
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void inOrder(Node root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	public void postOrder(Node root)
	{
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
}
class TreeApp
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BTree tree = new BTree();
		System.out.println("Enter number of values to insert:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value:");
			int val = s.nextInt();
			tree.insert(val);
		}
		int c;
		char ch;
		do
		{
			System.out.println("1:Pre Order\n2:In Order\n3:Post Order\n");
			System.out.println("Enter a choice:");
			c = s.nextInt();
			System.out.println("");
			switch(c)
			{
				case 1:tree.preOrder(tree.getRoot());
					break;
				case 2:tree.inOrder(tree.getRoot());
					break;
				case 3:tree.postOrder(tree.getRoot());
					break;
				default: System.out.println("Wrong Choice!");
			}
			System.out.println("Want to try another traversal? (y/n): ");
			ch = s.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
