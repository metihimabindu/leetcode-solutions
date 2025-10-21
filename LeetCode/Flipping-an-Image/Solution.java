class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][]arr=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1)image[i][j]=0;
                else image[i][j]=1;
            }
        }
        for(int i=0;i<image.length;i++){int count=0;
            for(int j=image[i].length-1;j>=0;j--){
                arr[i][count++]=image[i][j];
            }
        }
        return arr;
    }
}