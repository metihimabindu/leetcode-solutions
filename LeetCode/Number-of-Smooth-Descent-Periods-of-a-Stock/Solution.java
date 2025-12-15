1class Solution {
2    public long getDescentPeriods(int[] prices) {
3   long count=1,ans=1;
4   for(int i=1;i<prices.length;i++){
5    if(prices[i]==prices[i-1]-1){
6        count++;
7    }else{count=1;}
8    ans+=count;
9   }
10   return ans;
11    }
12}