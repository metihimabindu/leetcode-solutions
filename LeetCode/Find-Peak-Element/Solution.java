class Solution {
    public int findPeakElement(int[] nums) {
    int res= search(nums);
    return res;
    }
    public static int search(int []nums){
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }else{left=mid+1;}
        }
        return right;
    }
}