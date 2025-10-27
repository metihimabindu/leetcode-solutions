class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;int val=0;
        System.out.println(n+" "+matrix.length);
        for(int i=0;i<matrix.length;i++){
            int res=matrix[i][n-1];
            if(res>=target){val=i;break;}
        }
        System.out.println(val);
        for(int i=0;i<n;i++){
            if(matrix[val][i]==target)return true;
        }
        return false;
    }
}