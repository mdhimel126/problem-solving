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

    public void traverse(TreeNode root, HashMap<Integer, Integer> count){

        if(root!=null){
            count.put(root.val,count.getOrDefault(root.val,0)+1);
            traverse(root.left,count);
            traverse(root.right,count);
        }

    }
    public int[] findMode(TreeNode root) {
        
        HashMap <Integer, Integer> count= new HashMap<>();
        traverse(root,count);
        
        int max=0;
        for(int val: count.values()){
            if(max<val){
                max=val;
            }
        }

        List <Integer> list = new ArrayList<>();

        for(HashMap.Entry<Integer,Integer> i: count.entrySet()){
            if(i.getValue()==max){
                list.add(i.getKey());
            }
        }
        
        int [] arr=new int[list.size()];
        int k=0;
        
        for(int val:list){
            arr[k++]=val;
        }

        return arr;
    }
}