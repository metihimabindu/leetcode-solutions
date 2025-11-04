class Solution {
    public int[] sortArray(int[] nums) {
        quick(nums,0,nums.length-1);
        return nums;
    }
    public static void quick(int []nums,int lb,int up){
       if(lb<up){
            int mid=partition(nums,lb,up);
            quick(nums,lb,mid-1);quick(nums,mid+1,up);
        }
    }
    public static int partition(int[] nums,int lb,int up){
         int pivotIndex = lb + new Random().nextInt(up - lb + 1);
         swap(nums,lb,pivotIndex);
int pivot = nums[lb];int start=lb,end=up;
         while(start<end){
         while(start<=end && nums[start]<=pivot){start++;}
         while(start<=end && nums[end]>pivot){end--;}
         if(start<end){
            swap(nums,start,end);
         }
         }
         nums[lb]=nums[end];
         nums[end]=pivot;
         return end;
    }
     private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}