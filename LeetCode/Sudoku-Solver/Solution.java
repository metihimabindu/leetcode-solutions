class Solution {
    public void solveSudoku(char[][] board) {
        back(board);
    }
    public static boolean back(char[][] board){
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
         if(board[i][j]=='.'){
            char c;
            for( c='1';c<='9';c++){
            if(check(board,c,i,j)){
                board[i][j]=c;
                if(back(board)==true){return true;}
                else{board[i][j]='.';}
            }}
            return false;}
         }
      }
      return true;
    }
    public static boolean check(char[][] board,char c,int index,int i){
       for(int j=0;j<9;j++){
        if(board[j][i]==c){return false;}
        if(board[index][j]==c){return false;}
        if(board[(3*(index/3))+j/3][(3*(i/3))+j%3]==c){return false;}
       }
       return true;
    }
}