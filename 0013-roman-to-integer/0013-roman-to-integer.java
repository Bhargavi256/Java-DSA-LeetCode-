class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        int n = s.length();
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);
            if(map.get(ch)>=map.get(ch1))
                ans += map.get(ch);
            else
                ans -= map.get(ch);
        }
         ans += map.get(s.charAt(n-1));
        return ans;
        
    }
}