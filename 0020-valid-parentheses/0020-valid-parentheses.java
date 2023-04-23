class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'  ){
                char a = s.charAt(i);
                st.push(a);
            }
            else{
                if(st.empty()){
                    return false;}
                else{
                char c = st.peek();
                if((s.charAt(i) == ')' && c == '(') || (s.charAt(i) == ']' && c == '[')  || (s.charAt(i) == '}' && c == '{') ) 
                {
                    st.pop();
                }
                else
                    return false;
                
            }}
        }
        if(st.empty())
            return true;
        return false;
    }  
}