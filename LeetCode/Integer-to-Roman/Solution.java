class Solution {
    public String intToRoman(int num) {
        int []values={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String []symbols={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};String s="";
        for(int i=values.length-1;i>=0;i--){
            while(num>=values[i]){
             s+=symbols[i];
               num-=values[i];
            }
        }
        return s;
    }
}