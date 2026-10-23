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
    int sum=0;

    public int Calculation(TreeNode root, TreeNode prev){
         
         if(root!=null){
            Calculation(root.left,root);
            
            if(root.left==null && root.right==null && root==prev.left){
                sum+=root.val;
            }
            Calculation(root.right,root);
         }
         
         return sum;
    }
    
    public int sumOfLeftLeaves(TreeNode root) {

        return Calculation(root,root);
    }
}