class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            int n1=n%2;
            if(n1==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}