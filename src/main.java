import java.util.Scanner;
public class main {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		BST b = new BST();
		b.insertRec(2);
		b.insertRec(1);
		//b.INORDER(b.root);
		b.insertRec(7);
		b.insertRec(8);
		b.insertRec(42);
		b.insertRec(4);
		b.insertRec(9);
		b.insertRec(11);
		b.insertRec(10);
		b.insertRec(89);
		b.insertRec(12);
		b.insertRec(3);
		b.Inorder();
	}
}
