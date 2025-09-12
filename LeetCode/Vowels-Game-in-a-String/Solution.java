class Solution {
    public boolean doesAliceWin(String s) {
        int count=0,j=1,bob=0,ali=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'
            ||s.charAt(i)=='u' ){
                count++;
            if(count%2!=0 && j%2!=0){
                ali++;
                j++;
                count=0;
            }else if(count%2==0 && j%2==0){
              bob++;j++;count=0;
            }
            }
        }
        System.out.println(bob+" "+ali);
        return (bob>ali || (bob==0 && ali==0))?false:true;
    }
}