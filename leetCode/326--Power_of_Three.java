// class Solution {
//     public boolean isPowerOfThree(int n) {
        
//         while(n>1){

//             if(n>1 && n%3!=0){
//                 return false;
//             }
//             n=n/3;
//         }

//         if(n==1){
//             return true;
//         }
//         return false;
        
//     }
// }


class Solution {
    public boolean isPowerOfThree(int n) {

        if(n<=0){
            return false;
        }
        
        while(n%3==0){
            n=n/3;
        }

        return n==1;
        
    }
}


