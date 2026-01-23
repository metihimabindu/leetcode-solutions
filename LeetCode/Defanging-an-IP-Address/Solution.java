1class Solution {
2    public String defangIPaddr(String address) {
3        //StringBuilder str=new StringBuilder();
4        String str="";
5        for(int i=0;i<address.length();i++){
6            if(address.charAt(i)=='.'){
7                str+="[.]";
8            }else{
9                str+=address.charAt(i);
10            }
11        }
12        return str.toString();
13    }
14}