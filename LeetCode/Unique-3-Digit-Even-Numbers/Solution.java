class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        HashSet<Integer> l=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
               for(int k=0;k<digits.length;k++){
                if(i!=k && j!=k && i!=j && digits[k]%2==0 ) l.add(digits[i]*100+digits[j]*10+digits[k]);
                
               }
            }
        }
        for(int val:l){
            if(val>99 && val<999)count++;
        }
        return count;
    }
}