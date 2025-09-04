class Solution {
    public int findClosest(int x, int y, int z) {
       int d1=Math.abs(z-x);
       int d2=Math.abs(y-z);int res=0;
       if(d2>d1){
        res=1;
       }else if(d2==d1){
        res=0;
       }else{
        res=2;
       }
       System.out.println(d1+" "+d2);
        return res;
    }
}