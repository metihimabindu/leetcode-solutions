class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1,right=position[position.length-1]-position[0],ans=right;
        while(left<=right){
            int mid=(left+right)/2;
            int res=search(position,m,mid);
             if(res!=-1){ ans=mid;left=mid+1;}
             else{right=mid-1;}
        }
        return ans;
    }
    public static int search(int []position,int m,int mid){
        int count=1,sum=position[0];
        for(int i=1;i<position.length;i++){
        int diff=position[i]-sum;
        if(diff>=mid){count++;sum=position[i];}
        if(count>=m){return mid;}
        }
        return -1;
    }
}