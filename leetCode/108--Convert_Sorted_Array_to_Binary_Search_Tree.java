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

    public TreeNode builtBST(int [] values,int left, int right){

        if(left>right){
            return null;
        }

         TreeNode root= new  TreeNode();
        
        if(left<=right){
            int mid=(left+right)/2;
            
            root.val=values[mid];
            root.left=builtBST(values,left,mid-1);
            root.right=builtBST(values,mid+1,right);
        }
        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int l=nums.length-1;
        return builtBST(nums,0,l);
    }
}