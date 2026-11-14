// class Solution {
//     public boolean validPalindrome(String s) {
//         char [] arr= s.toCharArray();
//         int p=0;
//         int q=arr.length-1;
//         int flag1=0;
//         int flag2=0;
//         boolean isTrue1=true;
//         boolean isTrue2=true;

//         while(p<q){

//             if(flag1==0 && arr[p]!=arr[q]){
//                 flag1=1;
//                 p++;
//             }else if(arr[p]!=arr[q]){
//                 isTrue1=false;
//                 break;
//             }else{
//                 p++;
//                 q--;
//             }
//         }

//           p=0;
//           q=arr.length-1;
//         while(p<q){

//             if(flag2==0 && arr[p]!=arr[q]){
//                 flag2=1;
//                 q--;
//             }else if(arr[p]!=arr[q]){
//                 isTrue2=false;
//                 break;
//             }else{
//                 p++;
//                 q--;
//             }
//         }
//         return isTrue1 || isTrue2;
//     }
// }




class Solution {
    public boolean validPalindrome(String s) {
        char [] arr= s.toCharArray();
        int p=0;
        int q=arr.length-1;

        while(p<q){

           if(arr[p]!=arr[q]){
                return isPalindrome(arr,p+1,q) || isPalindrome(arr,p,q-1);
            }else{
                p++;
                q--;
            }
        }
        return true;

    }


    public boolean isPalindrome(char arr[],int p, int q){

     while(p<q){
        if(arr[p]!=arr[q]){
            return false;
         }else{
            p++;
            q--;
        }
     }
     return true;
    }
}