class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder str1=new StringBuilder(str).reverse();
        return str.equalsIgnoreCase(str1.toString());
    }
}