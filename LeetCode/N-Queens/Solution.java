class Solution {
   static char [][]dp;
   static List<List<String>> var;;
    public List<List<String>> solveNQueens(int n) {
        dp=new char[n][n];
        var=new ArrayList<>();
       for(int i=0;i<n;i++) Arrays.fill(dp[i], '.');
     queen(n,0);
     return var;
    }
    public static void queen(int n,int index){
      if(index==n){
         List<String> res=new ArrayList<>();
         for(char[] s:dp){res.add(new String(s));}
         var.add(res);
         return;
      }
      for(int i=0;i<n;i++){
        if(check(n,index,i)){
       dp[index][i]='Q';
       queen(n,index+1);
       dp[index][i]='.';
        }
      }
    }
    public static boolean check(int n,int index,int i){
      for(int j=0;j<index;j++){if(dp[j][i]=='Q')return false;}
      for(int j=index-1,k=i-1;j>=0 && k>=0;j--,k--){if(dp[j][k]=='Q')return false;}
      for(int j=index-1,k=i+1;j>=0 && k<n;j--,k++){if(dp[j][k]=='Q')return false;}
      return true;
    }
}