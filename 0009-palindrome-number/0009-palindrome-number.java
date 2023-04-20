class Solution {
    public boolean isPalindrome(int x) {
         if(x<0 || (x!=0 && x%10==0) )
             return false;
        int res = 0;
        int y = x;
        while (x !=0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if(res == y )
            return true;
        else
            return false;
    }
}