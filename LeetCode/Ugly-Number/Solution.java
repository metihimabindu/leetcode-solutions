class Solution {
    public boolean isUgly(int n) {
      if(n<=0){
        return false;
      }
        if(ugly(n)){
            return true;
        }
        return false;
    }
    public static boolean ugly(int n){
        int []primes={2,3,5};
        for(int val:primes){
            while(n%val==0){
                n/=val;
            }
        }
        return n==1;
    }
}