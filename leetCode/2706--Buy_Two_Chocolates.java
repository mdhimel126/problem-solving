// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int l=prices.length;
//         int m=money;
//         if(prices[0]<m){
//           m=m-prices[0];
//         }else{
//             return money;
//         }
//         for(int i=1; i<l; i++){
//             if(prices[i]<=m){
//                 m=m-prices[i];
//                 return m;
//             }
//         }
//         return money;
//     }
// }

class Solution {
    public int buyChoco(int[] prices, int money) {
        
       int firstLow=Integer.MAX_VALUE;
       int secondLow=Integer.MAX_VALUE;
    
       for(int i=0; i<prices.length; i++){
        if(prices[i]<firstLow){
            secondLow=firstLow;
            firstLow=prices[i];
        }else if(prices[i]<secondLow){
            secondLow=prices[i];
        }
       }
        
       int twoChocletePrice=firstLow+secondLow;
       
       if((money-twoChocletePrice)>=0){
         return money-twoChocletePrice;
       }
        return money;
    }
}