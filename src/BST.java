
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
			System.out.println("Data found");
			return temp1;
		}
		else if(data > temp1.getData())
		{
			Search(data,temp1.getRight());
		}
		else
		{
			Search(data,temp1.getLeft());
		}
		return null;
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
}
