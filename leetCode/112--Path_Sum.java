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

    public boolean sumFunction(TreeNode root, int target,int sum){
         if(root!=null){
            sum+=root.val;
            if(sum==target && root.left==null && root.right==null){
                return true;
            }
            return sumFunction(root.left,target,sum) || sumFunction(root.right,target,sum);
           
        }
        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
       return sumFunction(root,targetSum,0);
    }
}