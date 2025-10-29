class Solution {
    public int smallestNumber(int n) {

        for(int i=0;i<n;i++){
            int res=(int)Math.pow(2,i);
            if(res>n){
                return res-1;
            }
        }
        return 1;
    }
}