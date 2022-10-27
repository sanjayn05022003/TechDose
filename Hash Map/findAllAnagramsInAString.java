class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int len1=s.length();
        int len2=p.length();

        int[] alpha=new int[26];

        for(char ch:p.toCharArray()){
            alpha[ch-'a']++;
        }

        List<Integer>arr=new ArrayList<>();

        String pat=Arrays.toString(alpha);

        for(int i=0;i<=len1-len2;i++){

            String sub=s.substring(i,i+len2);
            int[] all=new int[26];

            for(char c:sub.toCharArray()){
                all[c-'a']++;
            }

            String match=Arrays.toString(all);
            if(match.equals(pat)){
                arr.add(i);
            }
        }

        return arr;
    }
}
