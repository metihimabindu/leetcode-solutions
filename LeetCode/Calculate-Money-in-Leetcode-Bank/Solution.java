class Solution {
    public int totalMoney(int n) {
        int sum=0;
        if(n>7){
        int val=n/7;int i=1;
       // System.out.println(val);
        while(i<=val){
            int res=i;
            for(res=i;res<=7+i-1;res++){
             sum+=res;
            }
            i++;
        }
        int diff=n-7*val;
        for(int j=0;j<diff;j++){
        sum+=i;
        i++;
        }
        }else{
         for(int i=1;i<=n;i++){
            sum+=i;
         }
        }
      return sum;
    }
}