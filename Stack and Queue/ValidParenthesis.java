class Solution {
    public boolean isValid(String s) {
        int len=s.length();
        
        if(len==1) return false;
        Stack<Character>stack=new Stack<Character>();
        
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(stack.empty()){
                return false;
            }
            else{
                if(s.charAt(i)==')' && stack.pop()!='('){
                    return false;
                }
                else if(s.charAt(i)=='}' && stack.pop()!='{'){
                    return false;
                }
                else if(s.charAt(i)==']' && stack.pop()!='['){
                    return false;
                }
            }
            
        }
        return stack.empty();
    }
}
