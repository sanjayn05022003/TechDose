class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        if(num==0){
            return true;
        }
       int i=1;
        while(i<num){
            
            int rem=num-i;
            String s=Integer.toString(i);
            String rev=Integer.toString(rem);
            
            StringBuilder sb=new StringBuilder(rev);
            int reversed=Integer.parseInt(sb.reverse().toString());
            
            if(reversed==i){
                return true;
            }
            i++;
        }
        return false;
    }
}
