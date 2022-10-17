class Solution {
    public int numSplits(String s) {
        
        int len=s.length();
        Set<Character>set1=new HashSet<>();
        Set<Character>set2=new HashSet<>();
        int freq[] = new int[26];
        for(int i=0; i<len; i++){
            freq[s.charAt(i)-'a']++;
        }
        set1.add(s.charAt(0));
        int totcount=0;
        freq[s.charAt(0)-'a']--;
        for(char ch:s.substring(1, len).toCharArray()){
            set2.add(ch);
        }
        int index=1;   
        while(index<len-1){
            if(set1.size()==set2.size()){
                totcount++;
            }
            // System.out.println(set1);
            // System.out.println(set2);
            set2.remove(s.charAt(index));
            if(freq[s.charAt(index)-'a']>1){
                set2.add(s.charAt(index));
            }
            set1.add(s.charAt(index));
            freq[s.charAt(index)-'a']--;
            index++;
        }
        if(set1.size()==set2.size()) totcount++;
        return totcount;

    }
}
