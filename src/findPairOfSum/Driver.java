package findPairOfSum;

class Node {
	int data;
	Node left;
	Node right;
	Node (int data) {
		this.data = data;
	}
}
public class Driver {
	public static void main(String[] args) {
		Node root = new Node(40);
		root.left = new Node(20);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right = new Node(60);
		root.right.right = new Node(70);
		root.right.left = new Node(50);
		Service Service = new Service();
		Service.sumOfPair(root, 130);
	}
}
