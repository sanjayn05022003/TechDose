class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len=s.length();

        Set<Character>set=new HashSet<>();
        int max=0;
        int j=0,i=0;

        while(i<len){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            else{
                set.add(s.charAt(i));
                i++;

                max=Math.max(max,set.size());
            }
        }
        return max;
    }
}
