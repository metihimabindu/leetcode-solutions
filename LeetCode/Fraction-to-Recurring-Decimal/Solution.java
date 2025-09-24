class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
       if(numerator==0){return "0";}
      StringBuilder l=new StringBuilder();
      if(numerator<0 ^ denominator<0){
        l.append("-");
      }
      long n=Math.abs((long)numerator);
      long m=Math.abs((long)denominator);
      l.append(n/m);
      long rem=n%m;
      if(rem==0){return l.toString();}
      l.append(".");
      HashMap<Long,Integer> l1=new HashMap<>();
      while(rem!=0){
        if(l1.containsKey(rem)){
            int index=l1.get(rem);
            l.insert(index,"(");
            l.append(")");
            break;
        }
        l1.put(rem,l.length());
        rem*=10;
        l.append(rem/m);
        rem%=m;
      }
      return l.toString();
    }
}