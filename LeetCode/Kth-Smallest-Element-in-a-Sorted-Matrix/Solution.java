class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                l1.add(matrix[i][j]);
            }
        }
        Collections.sort(l1);
        return l1.get(k-1);
    }
}