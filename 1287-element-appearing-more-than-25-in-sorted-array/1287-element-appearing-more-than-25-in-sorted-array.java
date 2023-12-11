class Solution {
    public int findSpecialInteger(int[] v) {
         int cnt = 1, ele=v[0];
         int qtr = v.length/4;
        for(int i=1;i<v.length;i++){
             if(ele == v[i])
               cnt++;
            else
              cnt=1;
            if(cnt>qtr)
                 return v[i];
            ele = v[i];
        }
        return ele;
    }
}