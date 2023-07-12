class Solution {
    public boolean isIsomorphic(String s, String t) {
      Map<Character,Character> map = new HashMap<>();
       
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char charc = s.charAt(i);
            if(map.containsKey(charc)){
                if(!map.get(charc).equals(t.charAt(i)))
                    return false;
            }
                else{
                    if(map.containsValue(t.charAt(i)))
                        return false;
                     map.put(charc,t.charAt(i));
                }
                   
            
        }
        return true;
    }
}