class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        if(nums.length==1){
             return nums[0];
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for(int index=2;index<nums.length;index++){
        int left=nums[index]+dp[index-2];
        int right=0+dp[index-1];
         dp[index]=Math.max(left,right);
        }
        return dp[nums.length-1];
    }
}