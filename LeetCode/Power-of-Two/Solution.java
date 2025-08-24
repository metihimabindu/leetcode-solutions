class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        /*int res=(int)(Math.log(n)/Math.log(2));
        return Math.pow(2,res)==n;*/
     while(n%2==0){
        n/=2;
     }
      return n==1?true:false;
    }
}