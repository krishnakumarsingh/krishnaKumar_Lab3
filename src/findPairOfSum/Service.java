package findPairOfSum;

import java.util.HashSet;

public class Service {
	public boolean findPair(Node root, int sum, HashSet<Integer> set) {
		if(root == null) {
			return false;
		}
		if(findPair(root.left, sum, set)) {
			return true;
		}
		if(set.contains(sum - root.data)) {
			System.out.println("Pair is (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		}
		else {
			set.add(root.data);
		}
		return findPair(root.right, sum, set);
	}
	
	public void sumOfPair(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if(!findPair(root, sum, set)) {
			System.out.println("print nodes are not found.");
		}
	}
}
