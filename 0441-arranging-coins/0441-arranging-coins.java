class Solution {

    public int Sqrt(long n) {
        if(n==0) return 0;
        long l =1 , h=n;
        while(l<=h){
         long mid = l + (h-l)/2;
          if(mid == n/mid) return (int)mid;
          else if(mid>n/mid) h = mid-1;
          else l = mid+1;
        }
        return (int) h;
    }
    public int arrangeCoins(int n) {
        long m = (int) n;
        return (Sqrt(8*m +1) - 1)/2;
        
    }
}