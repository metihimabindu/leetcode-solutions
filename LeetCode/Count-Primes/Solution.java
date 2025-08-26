class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n<2){
            return 0;
        }
       boolean []ar=new boolean[n+1];
       Arrays.fill(ar,true);
       ar[0]=false;
       ar[1]=false;
       for(int i=2;i*i<=n;i++){
        if(ar[i]){
            for(int j=i*i;j<=n;j+=i){
                ar[j]=false;
            }
        }
       }
       for(int i=2;i<n;i++){
        if(ar[i]){
            count++;
        }
       }
       return count;
    }
}