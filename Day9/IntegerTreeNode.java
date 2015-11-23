public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int n) {
		this.value = n;
		this.left = null;
		this.right = null;
	}


	public void add(int n) {
		if (n>this.value) {
			if (this.right == null) {
				this.right = new IntegerTreeNode(n);
			} else {
				this.right.add(n);
			}
		} else if (n<this.value) {
			//Add rest of this branch
		}
	}



	public int getMax() {
	IntegerTreeNode current = head;
		while (this.right != null) {
			
		}
	}

	public int getMin(int minimumOutput) {

	}


public static void main(String[] args) {
/**	IntegerTreeNode tree1 = new IntegerTreeNode(50);
	tree1.add(65);
	System.out.println("This is tree1 right" +tree1.right);
**/
}

}