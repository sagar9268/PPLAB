// program to construct a binary tree
// concept of object oriented design 
// any modification in the tree or node can be done directly in the class
// it enhances data encapsulation and hiding 
class node
{
 	  private int info;
 	  private node left_child;
 	  private node right_child;
 	  public node()
 	  {
 	     info=0;
 	     left_child=null;
 	     right_child=null;
 	  }
 	  public int get_info()
 	  {
 	    return info;
 	  } 
 	  public node get_left_child()
 	  {
 	     return left_child;
 	  }
      
 	  public node get_right_child()
 	  {
 	     return right_child;
 	  }
 	  public void set_left_child(node n)
 	  {
 	     left_child=n;
 	  }
 	  public void set_right_child(node n)
 	  {
             right_child=n;
   	  }
     	 public void set_info(int i)
   	{
     		info=i;
   	}
}
 
class Btree
{
	// instance variable creation
	node root;
	Btree()
	{
	 	root=null;
	}
	public void insert(int info)		// insert a node in BST
	{
		node n=new node();
		n.set_info(info);
		if(root==null)
		{
		 	root=n;
		}
		else
		{
		   node temp1=root;
		   node temp2=root;
		   while(temp1!=null)
		   {
		        temp2=temp1;
		   		if(info>temp1.get_info())
		   	 		temp1=temp1.get_right_child();
		   	 	else
		   	 		temp1=temp1.get_left_child();
		   }
		   if(info>temp2.get_info())
		   		temp2.set_right_child(n);
		   else
		        temp2.set_left_child(n);
		}
	 }
	 public node get_root()
	 {
	     return root;
	 }
	 public void preorder(node root)
	 {
	 	if(root==null)
	 		return;
	 	else
	 	{
	 		System.out.println(root.get_info());
	 		preorder(root.get_left_child());
	 		preorder(root.get_right_child());
	 	}	    
	 }
	  public void inorder(node root)
	 {
	 	if(root==null)
	 		return;
	 	else
	 	{
	 		inorder(root.get_left_child());
	 		System.out.println(root.get_info());
	 		
	 		inorder(root.get_right_child());
	 	}	    
	 }
	  public void postorder(node root)
	 {
	 	if(root==null)
	 		return;
	 	else
	 	{
	 		
	 		postorder(root.get_left_child());
	 		postorder(root.get_right_child());
	 		System.out.println(root.get_info());
	 	}	    
	 }
	  public int find_Minimum()
	{
		node temp1=root;
		node temp2=root;
		while(temp1!=null)
		{
			temp2=temp1;
			temp1=temp1.get_left_child();
		}
		return temp2.get_info();
	}
	 public int find_Maximum()
        {
                node temp1=root;
                node temp2=root;
                while(temp1!=null)
                {
                        temp2=temp1;
                        temp1=temp1.get_right_child();
                }
                return temp2.get_info();
        }



}
class PrintBt
{
	public static void main(String [] args)
	{
		Btree tree= new Btree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(5);
		tree.insert(2);
		tree.insert(35);
		tree.insert(40);
		tree.preorder(tree.get_root());
		System.out.println();
		tree.inorder(tree.get_root());
		System.out.println();
		tree.postorder(tree.get_root());
		int k=tree.find_Maximum();
		System.out.println("the max ele in the tree is->"+k);
		int p=tree.find_Minimum();
		System.out.println("the min ele in the tree is->"+p);
	}
}
	
		
	 
	 
	 	        	 		
   
           

