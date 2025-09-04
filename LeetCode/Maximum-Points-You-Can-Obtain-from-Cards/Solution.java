class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0,right=cardPoints.length-1,n=cardPoints.length-1;int lsum=0,rsum=0,maxsum=0;
            for(int i=0;i<k;i++){
              lsum+=cardPoints[i];
            }
            maxsum=Math.max(maxsum,lsum);
            for(int j=k-1;j>=0;j--){
                lsum-=cardPoints[j];
                rsum+=cardPoints[right];
                maxsum=Math.max(maxsum,lsum+rsum);
                right--;
            }
        
        return maxsum;
    }
}