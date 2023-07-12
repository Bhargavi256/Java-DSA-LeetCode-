class Solution {
    public boolean wordPattern(String pattern, String s) {
       Map<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++){
            char charc = pattern.charAt(i);
            if(map.containsKey(charc)){
                if(!map.get(charc).equals(words[i]))
                    return false;
            }
                else{
                    if(map.containsValue(words[i]))
                        return false;
                     map.put(charc,words[i]);
                }
                   
            
        }
        return true;
    }
}