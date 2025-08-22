class Solution {
    public int minimumArea(int[][] grid) {
        int l=grid.length,b=grid[0].length;
        int maxr=-1,maxc=-1,area=0;
        int minr=l,minc=b;
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                if(grid[i][j]==1){
                 maxr=Math.max(maxr,i);
                 minr=Math.min(minr,i);
                 maxc=Math.max(maxc,j);
                 minc=Math.min(minc,j);
                }
            }
        }
            if(maxr==-1){
                area=0;
                return area;
            }
        area=(maxr-minr+1)*(maxc-minc+1);
        return area;
    }
}