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
	public Node find(int key)
	{
		Node current = root;
		while(current.data != key)
		{
			if(key < current.data)
				current = current.left;
			else
				current = current.right;
			if(current == null)
				return null;
		}
		return current;
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
	public Node min()
	{
		Node current,last;
		current = root;
		last = current;
		while(current != null)
		{
			last = current;
			current = current.left;
		}
		return last;
	}
	public Node max()
	{
		Node current,last;
		current = root;
		last = current;
		while(current != null)
		{
			last = current;
			current = current.right;
		}
		return last;
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
		
		System.out.println("Enter a key value to find:");
		int k = s.nextInt();
		Node found = tree.find(k);
		if(found != null)
		{
			System.out.print("Found: ");
		}
		else
			System.out.print("Could not find: ");
		System.out.print(k + "\n");
		
		Node minimum = tree.min();
		System.out.println("Minimum:");
		minimum.displayNode();
		Node maximum = tree.max();
		System.out.println("\nMaximum:");
		maximum.displayNode();
		System.out.println("");
		}
}
