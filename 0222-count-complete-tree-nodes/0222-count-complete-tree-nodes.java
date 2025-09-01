class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int lp=countNodes(root.left);
        int rp=countNodes(root.right);
        return 1+lp+rp;
        
    }
}