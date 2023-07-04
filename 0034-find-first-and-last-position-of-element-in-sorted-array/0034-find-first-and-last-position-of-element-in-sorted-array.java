class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = new int[2];
        int res = -1;
        int start = 0;
        int end = nums.length-1;
        int mid=0;
         // System.out.print(start+" start ");
         // System.out.print(mid+" mid ");
         // System.out.println(end+" end ");
        while(start<=end){
             mid =start + (end-start)/2;
            if(nums[mid]==target){
                //System.out.print(mid+"mid");
              res   = mid;
                end = mid-1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
                 //System.out.print(end+"end");
            }
            else 
                start = mid+1;
             //System.out.print(start+"start");
        }
       a[0]=res;
         start = 0;
         end = nums.length-1;
        while(start<=end){
             mid = (start+end)/2;
            if(nums[mid]==target){
                res = mid;
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else 
                start = mid+1;
        }
      a[1] = res;
        return a;
    }
}