class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum=0;int left=0,right=0,count=0;
        while(right<nums.length){
             if(nums[right]==0){
               count++;
            }
            if(count>k){
                if(nums[left]==0){
                       count--;
                }
                       left++;
                }
                 if(count<=k){
               sum=Math.max(sum,right-left+1);
            }
            right++;
        }
        
        return sum;
    }
}