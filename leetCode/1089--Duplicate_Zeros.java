// class Solution {
//     public void duplicateZeros(int[] arr) {
//         int l=arr.length-1;
//         for(int i=0;i<=l; i++){
           
//             if(arr[i]==0){
//                 for(int j=l; j>i; j--){
//                     arr[j]=arr[j-1];
//                 }
//                 i+=1;
//              }
                
//         }
//     }
// }


class Solution {
    public void duplicateZeros(int[] arr) {
        int l=arr.length;
        int zeros=0;
        for(int i=0;i<l; i++){
           if(arr[i]==0){
            zeros+=1;
           }
        }

        int i=l-1;
        int j=zeros+l-1;

        while(i>=0){
            if(j<l){
               arr[j]=arr[i];
            }

            if(arr[i]==0){
                j--;
                if(j<l){
                  arr[j]=0;
                }
            }
            i--;
            j--;
        }
        
    }
}