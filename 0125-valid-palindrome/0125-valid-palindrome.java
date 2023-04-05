class Solution {
    boolean reverse(String s, int i)
    {
        
        int start =0, end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
                start++;
                end--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        
         s = s.replaceAll("[^a-zA-Z0-9]", "");
         s = s.replaceAll(",:", "");
         String s1 = s.toLowerCase();
        boolean res = reverse(s1,0);
        return res;
    }
}