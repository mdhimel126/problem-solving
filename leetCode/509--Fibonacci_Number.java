class Solution {

    int first=0;
    int second=1;
    int third=first+second;
    public int fib(int n) {
        
        if(n==0){
            return 0;
        }

        for(int i=1; i<n; i++){
            third=first+second;
            first=second;
            second=third;
        }
        return third;
       
    }
}