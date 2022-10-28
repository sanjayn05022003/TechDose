class Solution {
    public String frequencySort(String s) {
        int len=s.length();
        
        Map<Character,Integer>map=new HashMap<Character,Integer>();
        
        for(int i=0;i<len;i++){
              map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int mapsize=map.size();
        String toprint="";
        
        int iter=0;
        int totmax=999999;
        while(iter<mapsize){
            
            int max=-1;
            char ch=' ';
            
            for(char i:map.keySet()){
                if(map.get(i)>max && map.get(i)<=totmax){
                    max=map.get(i);
                    ch=i;
                }
            }
            for(int r=0;r<max;r++){
                toprint+=(ch);
            }
            map.put(ch,-1);
            totmax=max;
            iter++;
        }
        return toprint;
    }
}
