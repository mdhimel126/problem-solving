// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     List <Integer> list = new ArrayList<>();

//     public boolean myArray(int k){
//          int [] arr= new int[list.size()];
//          int x=0;

//          for(int val: list){
//             arr[x++]=val;
//          }

//         int p=0;
//         int q=arr.length-1;
//          while(p<q){
//             if(arr[p]+arr[q]==k){
//                 return true;
//             }else if(arr[p]+arr[q]>k){
//                 q=q-1;
//             }else{
//                 p=p+1;
//             }

//          }
//          return false;
         
//     }
    
//     public boolean findTarget(TreeNode root, int k) {
            
//         if(root!=null){
//             findTarget(root.left,k);
//             list.add(root.val);
//             findTarget(root.right,k);
//         }

//         return myArray(k);
//     }
// }





class Solution {

    public void inOrder(TreeNode root, List <Integer>list){
       
      if(root!=null){
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
         
    }
    
    public boolean findTarget(TreeNode root, int k) {
            
        List <Integer> list = new ArrayList<>();
        inOrder(root,list);

        int p=0;
        int q=list.size()-1;
         while(p<q){
            int val=list.get(p)+list.get(q);
            if(val==k){
                return true;
            }else if(val>k){
                q=q-1;
            }else{
                p=p+1;
            }

         }
         return false;

    }
}