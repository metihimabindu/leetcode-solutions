class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum=0;
        if(k>=nums.length){
            return nums.length;
        }
        for(int left=0;left<nums.length;left++){
            int count=0;
            for(int right=left;right<nums.length;right++){
            if(nums[right]==0){
               count++;
            }
            if(count<=k){
               sum=Math.max(sum,right-left+1);
            }else{
                break;
            }
            }
        }
        return sum;
    }
}