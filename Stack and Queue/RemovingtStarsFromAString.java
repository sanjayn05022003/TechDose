class Solution {
    public String removeStars(String s) {
        
        int len=s.length();
        
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<len;i++){
            char ch=s.charAt(i);

            
            if(ch=='*' && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        String res="";
        StringBuilder sb=new StringBuilder();
        //System.out.print(stack);

        while(!stack.isEmpty()){
            sb.append(stack.pop());
           // System.out.print(sb+" ");
        }

        res=sb.reverse().toString();
        return res;
    }
}
