class Solution {
    public boolean isHappy(int n) {
        if(happy(n)){
            return true;
        }
        return false;
    }
     public static boolean happy(int num){
       HashSet<Integer> l=new HashSet<>();
       while(num!=1 && !l.contains(num)){
        l.add(num);
        num=square(num);
       }
            return num==1;
    }
    public static int square(int num){
        int res=0;
            while(num>0){
                int rem=num%10;
                res+=(rem*rem);
                num/=10;
            }
            return res;
    }
}