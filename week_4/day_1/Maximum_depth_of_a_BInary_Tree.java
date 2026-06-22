class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null ) return 0;
        int val=maxd(root);
        return val;
    }
    public int maxd(TreeNode root){
        if(root==null) return 0;
        int left=maxd(root.left);
        int right=maxd(root.right);
        return Math.max(left,right)+1;
    }
}