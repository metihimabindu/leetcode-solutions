class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++)max=Math.max(max,piles[i]);
        int left=1,right=max;int ans=0;
        while(left<=right){
            int res=(left+right)/2;int count1=search(piles,res);
            System.out.println(count1);
            if(count1<=h){ ans=res;right=res-1;}
            else {left=res+1;}
        }
        return ans;
    }
    public static int search(int []piles,int hour){
        int count=0;
        for(int i=0;i<piles.length;i++){
         count+=Math.ceil((double)piles[i]/hour);
        }
        return count;
    }
}