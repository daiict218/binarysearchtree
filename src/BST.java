
public class BST {
	Node root;
	Node temp = root;
	
	public void insert(int data)
	{
		Node nodetoadd = new Node(data);
		if(root==null)
		{
			root = nodetoadd;
		}
		else
		{
			Node temp = root;
			Node x = temp;
			while(temp!=null)
			{
				if(data >= temp.getData())
				{
					x = temp;
					temp = temp.getRight();
				}
				else
				{
					x = temp;
					temp = temp.getLeft();
				}
			}
			nodetoadd.setParent(x);
			if(x.getData() > nodetoadd.getData())
			{
				x.setLeft(nodetoadd);
			}
			else
			{
				x.setRight(nodetoadd);
			}
		}
	}
	
	public Node Search(int data,Node temp1)
	{
		if(temp1==null)
		{
			System.out.println("Data not found");
			return null;
		}
		if(data == temp1.getData())
		{
			return temp1;
		}
		else if(data > temp1.getData())
		{
			return Search(data,temp1.getRight());
		}
		else
		{
			return Search(data,temp1.getLeft());
		}
	}
	
	
	public Node Successor(int x)
	{
		Node main = Search(x,root);
		Node z = main.getParent();
		if(main.getRight()!=null)
		{
			Node result = Minimum(main.getRight());
			System.out.println("Successor is : "+result.getData());
			return Minimum(main.getRight());
		}
		else
		{
			if(main.getParent()==null)
			{
				System.out.println("No Successor exists");
				return null;
			}
			else
			{
				if(main == z.getLeft())
				{
					System.out.println("Successor is : "+z.getData());
					return z;
				}
				else
				{
					if(main.getData() == maximum(root).getData())
					{
						System.out.println("No Successor exists");
						return null;
					}
					while(main != z.getLeft() && z != null)
					{
						main = z;
						z = z.getParent();
					}
					System.out.println("Successor is : "+z.getData());
					return z;
				}
			}
		}
	}
	
	public Node Predecessor(int x)
	{
		Node main = Search(x,root);
		Node z = main.getParent();
		if(main.getLeft()!=null)
		{
			Node result = maximum(main.getLeft());
			System.out.println("Predecessor is : "+result.getData());
			return maximum(main.getLeft());
		}
		else
		{
			if(main.getParent()==null)
			{
				System.out.println("No Predecssor exists");
				return null;
			}
			else
			{
				if(main == z.getRight())
				{
					System.out.println("Predecessor is : "+z.getData());
					return z;
				}
				else
				{
					if(main.getData() == Minimum(root).getData())
					{
						System.out.println("No Predecessor exists");
						return null;
					}
					while(main != z.getRight() && z != null)
					{
						main = z;
						z = z.getParent();
					}
					System.out.println("Successor is : "+z.getData());
					return z;
				}
			}
		}
	}
	
	public void INORDER(Node x)
	{
		if(x!=null)
		{
			INORDER(x.getLeft());
			System.out.println(x.getData());
			INORDER(x.getRight());
		}
	}
	
	public void PREORDER(Node x)
	{
		if(x!=null)
		{
			System.out.println(x.getData());
			PREORDER(x.getLeft());
			PREORDER(x.getRight());
		}
	}
	
	public void POSTORDER(Node x)
	{
		if(x!=null)
		{
			POSTORDER(x.getLeft());
			POSTORDER(x.getRight());
			System.out.println(x.getData());
		}
	}
	
	public Node maximum(Node node)
	{
		Node prev = null;
		Node temp = node;
		while(temp!=null)
		{
			prev = temp;
			temp = temp.getRight();
		}
		//System.out.println("Maximum element in the tree is : "+prev.getData());
		return prev;
	}
	
	public Node Minimum(Node node)
	{
		Node prev = null;
		Node temp = node;
		while(temp!=null)
		{
			prev = temp;
			temp = temp.getLeft();
		}
		//System.out.println("Minimum in the tree is : "+prev.getData());
		return prev;
	}
}
