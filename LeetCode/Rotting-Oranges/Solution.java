class pair{
    int row,col,tm;
    pair(int row,int col,int tm){
        this.row=row;this.col=col;this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        int [][]visited=new int[n][m];int cntfrh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    visited[i][j]=2;
                }else{visited[i][j]=0;}
                if(grid[i][j]==1){cntfrh++;}
            }
        }
        int tn=0;
        int []rrow={-1,0,1,0};
        int []ccol={0,1,0,-1};int cnt=0;
        while(!(q.isEmpty())){
         int r=q.peek().row;
         int c=q.peek().col;
         int t=q.peek().tm;
         tn=Math.max(tn,t);
         q.remove();
         for(int i=0;i<4;i++){
            int nrow=r + rrow[i];
            int ncol=c + ccol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 &&grid[nrow][ncol]==1){
              q.add(new pair(nrow,ncol,t+1));
              visited[nrow][ncol]=2;cnt++;
            }
         }
        }
        if(cnt!=cntfrh){return -1;}
        return tn;
    }
}
