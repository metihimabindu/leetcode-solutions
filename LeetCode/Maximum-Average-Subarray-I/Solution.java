class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int left=0,right=0;
      double div=Double.NEGATIVE_INFINITY,sum=0;
    while(right<nums.length){
        sum+=nums[right];
        if(right-left+1==k){
         div=Math.max(div,sum/k);
            sum-=nums[left];
            left++;
        }
        right++;
    }
    return div;
    }
}