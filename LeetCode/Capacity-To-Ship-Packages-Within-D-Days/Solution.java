class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int left=max,right=sum;int ans=-1,v=0;
        while(left<=right){
            int mid=(left+right)/2;
            int res=search(weights,days,mid);
            if(res<=days){ans=mid;right=mid-1;}
            else{left=mid+1;}
        }
        System.out.println(v);
        return ans;
    }
    public static int search(int []weights,int days,int mid){
         int s=0,count=1;
        for(int i=0;i<weights.length;i++){
          if(s+weights[i]>mid){count++;s=0;}
          s+=weights[i];
        }
        return count;
    }
}