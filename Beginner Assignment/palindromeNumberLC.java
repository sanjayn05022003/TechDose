class Solution {
    public boolean isPalindrome(int x) {
        
        String s=""+x;
        
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        
        if(rev.equals(s)){
            return true;
        }
        return false;
    }
}
