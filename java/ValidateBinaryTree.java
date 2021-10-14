//A valid BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.

//Question:Given the root of a binary tree, determine if it is a valid binary search tree (BST).

// Definition for a binary tree node.
 /* public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  */
public class ValidateBinaryTree {
	public boolean isValidBST(TreeNode root) {
		return isValidBinaryTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValidBinaryTree(TreeNode root, long minValue, long maxValue) {
		if (root == null) {
			return true;
		}
		if (root.val >= maxValue || root.val <= minValue) {
			return false;
		}
		return isValidBinaryTree(root.left, minValue, root.val) && isValidBinaryTree(root.right, root.val, maxValue);
	}
}
