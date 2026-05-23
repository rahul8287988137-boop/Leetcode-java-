class Solution {
    public int trailingZeroes(int n) {
       if(n>=5){
        trailingZeroes(n/5);
       int rem = n/5;
       return trailingZeroes(n/5) + rem;
       }
       else{
        return 0;
       }

    }
}