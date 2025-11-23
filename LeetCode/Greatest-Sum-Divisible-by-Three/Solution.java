class Solution {
    public int maxSumDivThree(int[] nums) {
      int []dp=new int[]{0,Integer.MIN_VALUE,Integer.MIN_VALUE};
      for(int num:nums){
        int []next=dp.clone();
        for(int i=0;i<3;i++){
            if(dp[i]==Integer.MIN_VALUE)continue;
            int sum=dp[i]+num;
            int mod=sum%3;
            next[mod]=Math.max(next[mod],sum);
        }
        dp=next;
      }
      return dp[0];
    }
}