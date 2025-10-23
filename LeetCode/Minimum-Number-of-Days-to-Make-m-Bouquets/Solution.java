class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max=bloomDay[0],min=bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int left=min,right=max;int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(possible(bloomDay,m,k,mid)){ans= mid;right=mid-1;}
            else{left=mid+1;}
        }
        return ans;
    }
    public static boolean possible(int[] bloomDay, int m, int k,int day){
        int count=0,d=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){d++;}
            else{count+=d/k;d=0;}
        }
        count+=d/k;
        return count>=m;
    }
}