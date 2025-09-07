class Solution {
    public int[] sumZero(int n) {
        int []a=new int[n];int k=0;
        if(n%2!=0){
            a[k++]=0;
        }
        for(int i=1;i<=n/2;i++){
                a[k++]=-i;
                 a[k++]=i;
            }
            return a;
    }
}