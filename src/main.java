
public class main {
	public static void main(String args[])
	{
		BST b = new BST();
		b.insert(2);
		b.insert(7);
		b.insert(8);
		b.insert(42);
		b.insert(4);
		b.insert(9);
		b.insert(11);
		b.insert(2);
		b.insert(10);
		b.insert(89);
		b.insert(12);
		b.INORDER(b.root);
		b.Search(2,b.root);
	}
}
