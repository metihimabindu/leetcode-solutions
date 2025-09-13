class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> l=new HashMap<>();
        for(int i=0;i<s.length();i++){
           l.put(s.charAt(i),l.getOrDefault(s.charAt(i),0)+1);
        }
        int max=0,max1=0;
        for(Map.Entry<Character,Integer> val:l.entrySet()){
    if(val.getKey()=='a' || val.getKey()=='e'|| val.getKey()=='i'|| val.getKey()=='o'|| val.getKey()=='u'){
        int va=val.getValue();
        max=Math.max(va,max);
    }else{
        int v=val.getValue( );
        max1=Math.max(v,max1);
    }
        }
        return max+max1;
    }
}