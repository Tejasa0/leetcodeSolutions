/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ele1 = new ArrayList<>();
        ArrayList<Integer> ele2 = new ArrayList<>();
        leafElements(root1, ele1);
        leafElements(root2, ele2);

        return ele1.equals(ele2);
    }

    private void leafElements(TreeNode root, List<Integer> ele){
        if(root.left == null && root.right == null) 
            ele.add(root.val);       
        if(root.left != null) leafElements(root.left, ele);
        if(root.right != null) leafElements(root.right, ele);
    }  
    
}