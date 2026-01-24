1class Solution {
2    public String replaceDigits(String s) {
3        String s2="";
4        for(int i=0;i<s.length();i++){
5            int n=Integer.valueOf(s.charAt(i))-48;
6            if(n>=0 && n<=9){
7              int m=(int)s.charAt(i-1)+n;
8              System.out.println((char)m);
9              s2+=String.valueOf((char)m);
10            }else{
11                s2+=s.charAt(i);
12            }
13        }
14        return s2;
15    }
16}