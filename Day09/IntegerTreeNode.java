public class IntegerTreeNode implements IntegerTree {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int newValue) {
		this.value = newValue;
		this.left = null;
		this.right = null;
	}

//Add a method toString() to the class. This methods must return a representation of your tree in String form, where every node is represented as a list in square brackets containing its value, the left branch, and the right branch; the left branch should be prefixed by “L” and the right branch by R, and an empty branch should be shown as an empty pair of square brackets. Some examples of outputs in Figure 1.																															After you have commited this version of toString(), make another version that returns a simplified representation, where every node is represented as a list in square brackets containing its value and its branches, but only if they are not empty; without using the “L” and “R” prefixes. Some examples of outputs in Figure 1.														Check that both versions of the method work by adding several elements and printing the String representation of the tree.

	public int toString() {
		if (left != null) {
			
		}
	}

	public int getDepth() {
		int leftDepth = 0;
		if (left != null) {
			leftDepth = left.getDepth();
		}
		int rightDepth = 0;
		if (right != null) {
			rightDepth = right.rightDepth();
		}
		if (leftDepth > rightDepth) {
			return 1 + leftDepth;
		} else {
			return 1 + rightDepth;
		}
	}

	public void add(int n) {
		if (n>this.value) {
			if (this.right == null) {
				this.right = new IntegerTreeNode(n);
			} else {
				this.right.add(n);
			}
		} else {
			if (this.left == null) {
				this.left = new IntegerTreeNode(n);
			} else {
				this.left.add(n);
			}
		}
	}

	public boolean contains(int intToFind) {
		boolean result = false;
		if (this.value == intToFind) {
			return true;
		} else {
			if (intToFind > this.value) {
				if (right != null) {
					right.contains(intToFind);
				}
			} else {
				if (left != null) {
					return left.contains(intToFind);
				}
			}
		}
		return result;
	}

	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}

	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMax();
		} 
	}

}