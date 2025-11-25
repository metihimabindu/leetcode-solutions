class Solution {
    public int rob(int[] nums) {
        //int dp[]=new int[nums.length];
        if(nums.length==1){
             return nums[0];
        }
        int prev=nums[0];
        int prev1=Math.max(nums[1],nums[0]);
        for(int index=2;index<nums.length;index++){
        
         int curr=Math.max(nums[index]+prev,prev1);
         prev=prev1;
         prev1=curr;
        }
        return prev1;
    }
}