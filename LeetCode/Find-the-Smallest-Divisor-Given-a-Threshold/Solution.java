class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int left=1,right=max,ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(round(nums,threshold,mid)){ans=mid;right=mid-1;}
            else{left=mid+1;}
        }
        return ans;
    }
    public static boolean round(int []nums,int threshold,int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/div);
            }
        return sum<=threshold;
    }
}