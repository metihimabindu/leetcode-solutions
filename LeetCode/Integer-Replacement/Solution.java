class Solution {
    public int integerReplacement(int n) {
        int count=0;
        long temp=n;
        while(temp>1){
          if(temp%2==0){temp/=2;}
          else{
               if(temp==3 || temp%4==1){temp--;}else{temp++;}
          }
        count++;
        }
        return count;
    }
}