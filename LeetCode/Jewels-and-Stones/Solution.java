class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> l=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            l.put(stones.charAt(i),l.getOrDefault(stones.charAt(i),0)+1);
        }
        int sum=0;
        for(int i=0;i<jewels.length();i++){
            if(l.containsKey(jewels.charAt(i))){
                sum+=l.get(jewels.charAt(i));
            }
        }
        return sum;
    }
}