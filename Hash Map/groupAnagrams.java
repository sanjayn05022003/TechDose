class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int len=strs.length;

        Map<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            int[] alpha=new int[26];

            for(char ch:s.toCharArray()){
                alpha[ch-'a']++;
            }

            String freq=Arrays.toString(alpha);
            System.out.println(freq);

            if(map.containsKey(freq)){
                map.get(freq).add(s);
            }
            else{
                List<String>ls=new ArrayList<String>();
                ls.add(s);
                map.put(freq,ls);
            }
        }

        return new ArrayList<>(map.values());
    }
}
