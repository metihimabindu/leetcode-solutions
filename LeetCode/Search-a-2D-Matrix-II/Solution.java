class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=0,n=matrix.length;
        for(int i=0;i<n;i++){
            m=matrix[i].length;
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){return true;}
            }
        }
        System.out.println(m+" "+n);
        return false;
    }
}