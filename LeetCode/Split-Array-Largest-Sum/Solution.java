class Solution {
    public int splitArray(int[] nums, int k) {
        int s=0,max=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int left=max,right=s,ans=right;
        while(left<=right){
          int mid=(left+right)/2;
          int res=search(nums,mid);
          System.out.println(ans);
          if(res>k){ans=mid;left=mid+1;}
          else{right=mid-1;}
        }
        return left;
    }
    public static int search(int []nums,int mid){
        int sum=0,c=1,max=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){sum+=nums[i];}
            else{c++;sum=nums[i];}
        }
        return c;
    }
}