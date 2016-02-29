public class IntegerTreeNode implements IntegerTree {

	private int value;

	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int newValue) {
		this.value = newValue;
		this.left = null;
		this.right = null;
	}
//the following uses recursion to go through a binary tree
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
//	public int getDepth() {
//		if (left == null) {
//			return 1;
//		} else {
//			return 1 + left.getDepth();
//		}
//	}

	public void addInteger(int newInteger) {
		if (newInteger>this.value) {
			if (this.right == null) {
				this.right = new IntegerTreeNode(newInteger);
			} else {
				this.right.add(newInteger);
			}
		} else {
			if (this.left == null) {
				this.left = new IntegerTreeNode(newInteger);
			} else {
				this.left.addInteger(newInteger);
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
			return right.getMax()
		}
	}

	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMax()
		} 
	}

}