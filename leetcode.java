class TreeNode {
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

class Solution {
  boolean foundLeaf = false;
  public TreeNode RetriveLeaf(TreeNode node) {
    if (node.left == null && node.right == null) {
      foundLeaf = true; return node;
      
    }

  }
  public String smallestFromLeaf(TreeNode root) {
    
    
  }
}

public class leetcode {
  public static void main(String[] args) {
    Solution s = new Solution();
    TreeNode root = new TreeNode(25,
        new TreeNode(1,
            new TreeNode(1, null, null),
            new TreeNode(3, null, null)),
        new TreeNode(3,
            new TreeNode(0, null, null),
            new TreeNode(2, null, null)));
    System.err.println(s.smallestFromLeaf(root));
    root = new TreeNode(0,
        new TreeNode(1,
            new TreeNode(3, null, null),
            new TreeNode(4, null, null)),
        new TreeNode(2,
            new TreeNode(3, null, null),
            new TreeNode(4, null, null)));
    System.err.println(s.smallestFromLeaf(root));
  }
}